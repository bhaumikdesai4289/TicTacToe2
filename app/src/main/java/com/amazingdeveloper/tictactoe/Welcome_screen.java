package com.amazingdeveloper.tictactoe;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class Welcome_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_welcome_screen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread {
        short HOME_PAGE_TIMEOUT = 4000;

        public void run() {
            try {
                sleep(HOME_PAGE_TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent homeIntent = new Intent(Welcome_screen.this, TicTacToe.class);
            startActivity(homeIntent);
            Welcome_screen.this.finish();
        }
    }
}
