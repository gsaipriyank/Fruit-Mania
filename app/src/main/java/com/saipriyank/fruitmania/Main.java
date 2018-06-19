package com.saipriyank.fruitmania;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Main extends AppCompatActivity {

    ImageView im11,im12,im13,im14,im21,im22,im23,im24,im31,im32,im33,im34,im41,im42,im43,im44;
    TextView tv1,tv2;
    Integer[] ca = {101,102,103,104,105,106,107,108,201,202,203,204,205,206,207,208};
    int im101,im102,im103,im104,im105,im106,im107,im108,im201,im202,im203,im204,im205,im206,im207,im208;

    int fc,sc;
    int cf,cs;
    int cno =1 ;
    int turn = 1;
    int pp=0, cpup=0;

    TextView tv_turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        //getSupportActionBar().hide();

        tv_turn = (TextView)findViewById(R.id.tv_turn);

        tv2 = (TextView)findViewById(R.id.tv2);
        tv1 = (TextView)findViewById(R.id.tv1);

        im11 = (ImageView)findViewById(R.id.im11);
        im12 = (ImageView)findViewById(R.id.im12);
        im13 = (ImageView)findViewById(R.id.im13);
        im14 = (ImageView)findViewById(R.id.im14);

        im21 = (ImageView)findViewById(R.id.im21);
        im22 = (ImageView)findViewById(R.id.im22);
        im23 = (ImageView)findViewById(R.id.im23);
        im24 = (ImageView)findViewById(R.id.im24);

        im31 = (ImageView)findViewById(R.id.im31);
        im32 = (ImageView)findViewById(R.id.im32);
        im33 = (ImageView)findViewById(R.id.im33);
        im34 = (ImageView)findViewById(R.id.im34);

        im41 = (ImageView)findViewById(R.id.im41);
        im42 = (ImageView)findViewById(R.id.im42);
        im43 = (ImageView)findViewById(R.id.im43);
        im44 = (ImageView)findViewById(R.id.im44);

        im11.setTag("0");
        im12.setTag("1");
        im13.setTag("2");
        im14.setTag("3");
        im21.setTag("4");
        im22.setTag("5");
        im23.setTag("6");
        im24.setTag("7");
        im31.setTag("8");
        im32.setTag("9");
        im33.setTag("10");
        im34.setTag("11");
        im41.setTag("12");
        im42.setTag("13");
        im43.setTag("14");
        im44.setTag("15");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(ca));

        tv1.setTextColor(Color.BLACK);
        tv2.setTextColor(Color.GRAY);
        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im11,card);
            }
        });

        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im12,card);

            }
        });

        im13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int card = Integer.parseInt((String) v.getTag());
                doStuff(im13,card);

            }
        });

        im14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im14,card);

            }
        });

        im21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im21,card);

            }
        });

        im22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im22,card);

            }
        });

        im23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im23,card);

            }
        });

        im24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im24,card);

            }
        });

        im31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im31,card);

            }
        });

        im32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im32,card);

            }
        });

        im33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im33,card);
            }
        });

        im34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im34,card);

            }
        });

        im41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im41,card);

            }
        });

        im42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im42,card);

            }
        });

        im43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int card = Integer.parseInt((String) v.getTag());
                doStuff(im43,card);

            }
        });

        im44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int card = Integer.parseInt((String) v.getTag());
                doStuff(im44,card);
            }
        });
    }
    private void doStuff(ImageView im, int crd) {

        if (ca[crd] == 101) {
            im.setImageResource(im101);
        }
        else if (ca[crd] == 102) {
            im.setImageResource(im102);
        }
        else if (ca[crd] == 103) {
            im.setImageResource(im103);
        }
        else if (ca[crd] == 104) {
            im.setImageResource(im104);
        }
        else if (ca[crd] == 105) {
            im.setImageResource(im105);
        }
        else if (ca[crd] == 106) {
            im.setImageResource(im106);
        }
        else if (ca[crd] == 107) {
            im.setImageResource(im107);
        }
        else if (ca[crd] == 108) {
            im.setImageResource(im108);
        }
        else if (ca[crd] == 201) {
            im.setImageResource(im201);
        }
        else if (ca[crd] == 202) {
            im.setImageResource(im202);
        }
        else if (ca[crd] == 203) {
            im.setImageResource(im203);
        }
        else if (ca[crd] == 204) {
            im.setImageResource(im204);
        }
        else if (ca[crd] == 205) {
            im.setImageResource(im205);
        }
        else if (ca[crd] == 206) {
            im.setImageResource(im206);
        }
        else if (ca[crd] == 207) {
            im.setImageResource(im207);
        }
        else if (ca[crd] == 208) {
            im.setImageResource(im208);
        }

        if (cno == 1) {
            fc = ca[crd];
            if (fc > 200) {
                fc = fc - 100;
            }
            cno = 2;
            cf = crd;
            im.setEnabled(false);
        }else if(cno == 2) {
            sc = ca[crd];
            if (sc > 200) {
                sc = sc - 100;
            }
            cno = 1;
            cs = crd;

            im11.setEnabled(false);
            im12.setEnabled(false);
            im13.setEnabled(false);
            im14.setEnabled(false);
            im21.setEnabled(false);
            im22.setEnabled(false);
            im23.setEnabled(false);
            im24.setEnabled(false);
            im31.setEnabled(false);
            im32.setEnabled(false);
            im33.setEnabled(false);
            im34.setEnabled(false);
            im41.setEnabled(false);
            im42.setEnabled(false);
            im43.setEnabled(false);
            im44.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    private void calculate() { //Try Sound Here
        if (fc == sc){
            if(cf == 0){
                im11.setVisibility(View.INVISIBLE);
            } else if (cf == 1) {
                im12.setVisibility(View.INVISIBLE);
            } else if (cf == 2) {
                im13.setVisibility(View.INVISIBLE);
            } else if (cf == 3) {
                im14.setVisibility(View.INVISIBLE);
            } else if (cf == 4) {
                im21.setVisibility(View.INVISIBLE);
            } else if (cf == 5) {
                im22.setVisibility(View.INVISIBLE);
            } else if (cf == 6) {
                im23.setVisibility(View.INVISIBLE);
            } else if (cf == 7) {
                im24.setVisibility(View.INVISIBLE);
            } else if (cf == 8) {
                im31.setVisibility(View.INVISIBLE);
            } else if (cf == 9) {
                im32.setVisibility(View.INVISIBLE);
            } else if (cf == 10) {
                im33.setVisibility(View.INVISIBLE);
            } else if (cf == 11) {
                im34.setVisibility(View.INVISIBLE);
            } else if (cf == 12) {
                im41.setVisibility(View.INVISIBLE);
            } else if (cf == 13) {
                im42.setVisibility(View.INVISIBLE);
            } else if (cf == 14) {
                im43.setVisibility(View.INVISIBLE);
            } else if (cf == 15) {
                im44.setVisibility(View.INVISIBLE);
            }

            if(cs == 0){
                im11.setVisibility(View.INVISIBLE);
            } else if (cs == 1) {
                im12.setVisibility(View.INVISIBLE);
            } else if (cs == 2) {
                im13.setVisibility(View.INVISIBLE);
            } else if (cs == 3) {
                im14.setVisibility(View.INVISIBLE);
            } else if (cs == 4) {
                im21.setVisibility(View.INVISIBLE);
            } else if (cs == 5) {
                im22.setVisibility(View.INVISIBLE);
            } else if (cs == 6) {
                im23.setVisibility(View.INVISIBLE);
            } else if (cs == 7) {
                im24.setVisibility(View.INVISIBLE);
            } else if (cs == 8) {
                im31.setVisibility(View.INVISIBLE);
            } else if (cs == 9) {
                im32.setVisibility(View.INVISIBLE);
            } else if (cs == 10) {
                im33.setVisibility(View.INVISIBLE);
            } else if (cs == 11) {
                im34.setVisibility(View.INVISIBLE);
            } else if (cs == 12) {
                im41.setVisibility(View.INVISIBLE);
            } else if (cs == 13) {
                im42.setVisibility(View.INVISIBLE);
            } else if (cs == 14) {
                im43.setVisibility(View.INVISIBLE);
            } else if (cs == 15) {
                im44.setVisibility(View.INVISIBLE);
            }

            if (turn == 1) {
                pp++;
                tv1.setText("P1: " + pp);
            } else if (turn == 2) {
                cpup++;
                tv2.setText("P2: " + cpup);
            }
        }else {
            im11.setImageResource(R.drawable.q);
            im12.setImageResource(R.drawable.q);
            im13.setImageResource(R.drawable.q);
            im14.setImageResource(R.drawable.q);
            im21.setImageResource(R.drawable.q);
            im22.setImageResource(R.drawable.q);
            im23.setImageResource(R.drawable.q);
            im24.setImageResource(R.drawable.q);
            im31.setImageResource(R.drawable.q);
            im32.setImageResource(R.drawable.q);
            im33.setImageResource(R.drawable.q);
            im34.setImageResource(R.drawable.q);
            im41.setImageResource(R.drawable.q);
            im42.setImageResource(R.drawable.q);
            im43.setImageResource(R.drawable.q);
            im44.setImageResource(R.drawable.q);

            if(turn == 1){
                turn = 2 ;
                tv1.setTextColor(Color.GRAY);
                tv2.setTextColor(Color.BLACK);
                tv_turn.setText("Player 2 Turn");

            }else if(turn == 2) {
                turn = 1;
                tv2.setTextColor(Color.GRAY);
                tv1.setTextColor(Color.BLACK);
                tv_turn.setText("Player 1 Turn");
            }
        }

        im11.setEnabled(true);
        im12.setEnabled(true);
        im13.setEnabled(true);
        im14.setEnabled(true);
        im21.setEnabled(true);
        im22.setEnabled(true);
        im23.setEnabled(true);
        im24.setEnabled(true);
        im31.setEnabled(true);
        im32.setEnabled(true);
        im33.setEnabled(true);
        im34.setEnabled(true);
        im41.setEnabled(true);
        im42.setEnabled(true);
        im43.setEnabled(true);
        im44.setEnabled(true);

        checkEnd();
    }

    private void checkEnd() {
        if (im11.getVisibility() == View.INVISIBLE &&
                im12.getVisibility() == View.INVISIBLE &&
                im13.getVisibility() == View.INVISIBLE &&
                im14.getVisibility() == View.INVISIBLE &&
                im21.getVisibility() == View.INVISIBLE &&
                im22.getVisibility() == View.INVISIBLE &&
                im23.getVisibility() == View.INVISIBLE &&
                im24.getVisibility() == View.INVISIBLE &&
                im31.getVisibility() == View.INVISIBLE &&
                im32.getVisibility() == View.INVISIBLE &&
                im33.getVisibility() == View.INVISIBLE &&
                im34.getVisibility() == View.INVISIBLE &&
                im41.getVisibility() == View.INVISIBLE &&
                im42.getVisibility() == View.INVISIBLE &&
                im43.getVisibility() == View.INVISIBLE &&
                im44.getVisibility() == View.INVISIBLE &&
                pp > cpup) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main.this,R.style.Cust);
            alertDialogBuilder
                    .setTitle("Match Results")
                    .setMessage("Player 1 Wins!\n\nPlayer 1 Score: " + pp + "\nPlayer 2 Score: " + cpup)
                    .setCancelable(false)
                    .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Main.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        } else if (im11.getVisibility() == View.INVISIBLE &&
                im12.getVisibility() == View.INVISIBLE &&
                im13.getVisibility() == View.INVISIBLE &&
                im14.getVisibility() == View.INVISIBLE &&
                im21.getVisibility() == View.INVISIBLE &&
                im22.getVisibility() == View.INVISIBLE &&
                im23.getVisibility() == View.INVISIBLE &&
                im24.getVisibility() == View.INVISIBLE &&
                im31.getVisibility() == View.INVISIBLE &&
                im32.getVisibility() == View.INVISIBLE &&
                im33.getVisibility() == View.INVISIBLE &&
                im34.getVisibility() == View.INVISIBLE &&
                im41.getVisibility() == View.INVISIBLE &&
                im42.getVisibility() == View.INVISIBLE &&
                im43.getVisibility() == View.INVISIBLE &&
                im44.getVisibility() == View.INVISIBLE &&
                pp < cpup) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main.this,R.style.Cust);
            alertDialogBuilder
                    .setTitle("Match Results")
                    .setMessage("Player 2 Wins!\n\nPlayer 1 Score: " + pp + "\nPlayer 2 Score: " + cpup)
                    .setCancelable(false)
                    .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent1 = new Intent(getApplicationContext(), Main.class);
                            startActivity(intent1);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        } else if (im11.getVisibility() == View.INVISIBLE &&
                im12.getVisibility() == View.INVISIBLE &&
                im13.getVisibility() == View.INVISIBLE &&
                im14.getVisibility() == View.INVISIBLE &&
                im21.getVisibility() == View.INVISIBLE &&
                im22.getVisibility() == View.INVISIBLE &&
                im23.getVisibility() == View.INVISIBLE &&
                im24.getVisibility() == View.INVISIBLE &&
                im31.getVisibility() == View.INVISIBLE &&
                im32.getVisibility() == View.INVISIBLE &&
                im33.getVisibility() == View.INVISIBLE &&
                im34.getVisibility() == View.INVISIBLE &&
                im41.getVisibility() == View.INVISIBLE &&
                im42.getVisibility() == View.INVISIBLE &&
                im43.getVisibility() == View.INVISIBLE &&
                im44.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main.this,R.style.Cust);
            alertDialogBuilder
                    .setTitle("Match Results")
                    .setMessage("It's a Tie!\n\nPlayer 1 Score: " + pp + "\nPlayer 2 Score: " + cpup)
                    .setCancelable(false)
                    .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent2 = new Intent(getApplicationContext(), Main.class);
                            startActivity(intent2);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }




    private void frontOfCardsResources() {

        im101=R.drawable.im101;
        im102=R.drawable.im102;
        im103=R.drawable.im103;
        im104=R.drawable.im104;
        im105=R.drawable.im105;
        im106=R.drawable.im106;
        im107=R.drawable.im107;
        im108=R.drawable.im108;

        im201=R.drawable.im201;
        im202=R.drawable.im202;
        im203=R.drawable.im203;
        im204=R.drawable.im204;
        im205=R.drawable.im205;
        im206=R.drawable.im206;
        im207=R.drawable.im207;
        im208=R.drawable.im208;

    }

    @Override
    public void onBackPressed() {
        final android.app.AlertDialog.Builder al = new android.app.AlertDialog.Builder(Main.this, R.style.Cust);
        al.setTitle("Leave Game?");
        al.setMessage("Are you sure? Current progress will be lost.");
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
