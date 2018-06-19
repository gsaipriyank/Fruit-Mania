package com.saipriyank.fruitmania;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.menu);

        Button btStart = (Button)findViewById(R.id.btStart);
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(Menu.this,Main.class);
                startActivity(start);
            }
        });

        Button btRules = (Button)findViewById(R.id.btRules);

        btRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent rules = new Intent(Menu.this,Rules.class);
                startActivity(rules);
            }
        });

        Button btExit = (Button)findViewById(R.id.btExit);
        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
            }
        });
    }


    @Override
    public void onBackPressed() {
        final android.app.AlertDialog.Builder al = new android.app.AlertDialog.Builder(Menu.this,R.style.Cust);
        al.setTitle("Exit");
        al.setMessage("Are you sure you want to exit the game?");
        al.setCancelable(true);
        al.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface di, int i) {
                di.cancel();
            }
        });
        al.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        android.app.AlertDialog ad = al.create();
        ad.show();
    }
}
