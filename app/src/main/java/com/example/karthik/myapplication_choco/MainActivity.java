package com.example.karthik.myapplication_choco;

import android.app.LauncherActivity;
import android.content.DialogInterface;
import android.content.Intent;
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
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Orders");
    String record = "";
    // Variables to store the 5 digit token number
    Random rand = new Random();
    int  token0 = 1;
    char token1 = 'a';
    char token2 = 'a';
    char token3 = 'a';
    String token = "";
    // variable to store length of selected item
    int count = 0;
    String token_str = String.valueOf(token);
    // Array to store names of selected items.
    ArrayList<String> selection = new ArrayList<String>();
    CardView cardView;
    // variable to store refrence key of placed order.
    String refKey = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maingrid = (GridLayout)findViewById(R.id.maingrid);

        setToggleEvent(maingrid);


    }
    // Function to make changes in 1 activity.
    private void setToggleEvent(GridLayout maingrid) {
        // Read item names from the strings.xml
        final String[] item_names = getResources().getStringArray(R.array.items_list);
        // Loop through the 1 grid to check for clicked icons.
        for (int i = 0; i < maingrid.getChildCount(); i++) {

            final CardView cardView = (CardView) maingrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (finalI == 0 && count <3) {
                        // If an icon is selected, change color to orange and add name to selected array
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            // If an icon is deselected, change color to default, and remove it from selected array.
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 1 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 2 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 3 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 4 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 5 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 6 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 7 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 8 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count <3)
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else{
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    } else if (finalI == 9 && count <3) {
                        if(cardView.getCardBackgroundColor().getDefaultColor() == -1 && count<3 )
                        {
                            cardView.setCardBackgroundColor(Color.parseColor("#DC143C"));
                            selection.add(item_names[finalI]);
                            count++;
                        }
                        else {
                            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                            selection.remove(item_names[finalI]);
                            count--;
                        }
                    }

                }

            });
        }

    }
    // Function to listen to clicked buttons.
    public void onClickBtn(View v) {
        // If "orderbutton" is clicked: display token and push selection with token to firebase.
        if (v.getId() == R.id.orderbutton) {
            token0 = rand.nextInt(50) + 1;
            token1 = Character.toUpperCase((char)(rand.nextInt(26) + 'a'));
            token2 = Character.toUpperCase((char)(rand.nextInt(26) + 'a'));
            token3 = Character.toUpperCase((char)(rand.nextInt(26) + 'a'));
            token = "" + token3 + token2 + token1 + String.valueOf(token0);
            selection.add(token);
//            Toast.makeText(this, "Order Placed " + selection, Toast.LENGTH_LONG).show();
            DatabaseReference pushedPostRef = myRef.push();
            pushedPostRef.setValue(selection);
            refKey = pushedPostRef.getKey();
            Intent intent = new Intent(MainActivity.this, display.class);
            intent.putStringArrayListExtra("token",selection);
            startActivity(intent);
            // Clear the selected items
            selection.clear();
            for (int i = 0; i < maingrid.getChildCount(); i++) {

                final CardView cardView = (CardView) maingrid.getChildAt(i);
                cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            }
            count = 0;

        }
        // If "orderbutton3" is clicked: delete the child in firebase via the reference key.
        if (v.getId() == R.id.orderbutton3) {
            Toast.makeText(this, "Order Cancelled " , Toast.LENGTH_LONG).show();
            myRef.child(refKey).removeValue();
            selection.clear();
            for (int i = 0; i < maingrid.getChildCount(); i++) {

                final CardView cardView = (CardView) maingrid.getChildAt(i);
                cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            }
            count = 0;
        }
    }


}