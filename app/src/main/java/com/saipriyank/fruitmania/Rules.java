package com.saipriyank.fruitmania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);

        TextView tv1 = (TextView)findViewById(R.id.tv1);

        String para1 = "This is a 2 Player based game.\n" +
                "\n" +

                "* There are 16 tiles behind which fruits are hidden. You can tap on any tile and a fruit is revealed.\n\n" +
                "* There are 8 fruits hidden in all and in pairs of two, you have to open the correct pair one after another.\n\n" +
                "* You get a point for whenever you open the correct pair.\n\n"+
                "* Every time you open a correct pair you get an extra chance to play.\n\n"+
                "* The main kick is to remember the location of the fruits.\n\n"+
                "* Both players play turn-by-turn.\n\n"+
                "* When all fruits are revealed the player with the highest score wins the game.\n\n";

        tv1.setText(para1);
    }
}
