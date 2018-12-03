package com.example.karthik.myapplication_choco;

import android.app.LauncherActivity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    GridLayout maingrid;
    #firebase
	FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Orders");
    String record = "";
    Random rand = new Random();
    int  token = rand.nextInt(50) + 1;
    int count = 0;
    String token_str = String.valueOf(token);
    ArrayList<String> selection = new ArrayList<String>();
    CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        maingrid = (GridLayout)findViewById(R.id.maingrid);


        setToggleEvent(maingrid);


    }

    private void setToggleEvent(GridLayout maingrid) {



            for (int i = 0; i < maingrid.getChildCount(); i++) {

                final CardView cardView = (CardView) maingrid.getChildAt(i);
                final int finalI = i;
                cardView.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        if (finalI == 0 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("snickers");
                            count++;



                        } else if (finalI == 1 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("twix");
                            count++;

                        } else if (finalI == 2 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("mars");
                            count++;

                        } else if (finalI == 3 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("milkyway");
                            count++;

                        } else if (finalI == 4 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("m&m");
                            count++;

                        } else if (finalI == 5 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("skittles");
                            count++;

                        } else if (finalI == 6 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("haribo");
                            count++;

                        } else if (finalI == 7 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("musketeers");
                            count++;

                        } else if (finalI == 8 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("dove");
                            count++;

                        } else if (finalI == 9 & cardView.getCardBackgroundColor().getDefaultColor() == -1 & count <3) {
                            cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                            selection.add("maltesers");
                            count++;

                        }

                    }

                });
            }

    }

    public void onClickBtn(View v) {
        if (v.getId() == R.id.orderbutton) {
            Toast.makeText(this, "Order Placed " + token, Toast.LENGTH_LONG).show();
            myRef.push().setValue(selection);
            selection.clear();
            for (int i = 0; i < maingrid.getChildCount(); i++) {

                final CardView cardView = (CardView) maingrid.getChildAt(i);
                cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            }
            count = 0;
        }
        if (v.getId() == R.id.orderbutton3) {
            Toast.makeText(this, "Order Cancelled " , Toast.LENGTH_LONG).show();
            selection.clear();
            for (int i = 0; i < maingrid.getChildCount(); i++) {

                final CardView cardView = (CardView) maingrid.getChildAt(i);
                cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            }
            count = 0;
        }
    }


}
