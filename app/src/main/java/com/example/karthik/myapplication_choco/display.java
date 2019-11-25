package com.example.karthik.myapplication_choco;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import java.util.ArrayList;


public class display extends MainActivity {

    ArrayList<String> name = new ArrayList<>();
    boolean click;


    @SuppressLint("MissingSuperCall")
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent i = getIntent();
        click = i.getExtras().getBoolean("clicked");
        name = i.getStringArrayListExtra("token");
        final Button button = (Button) findViewById(R.id.orderbutton3);
        TextView textView = (TextView) findViewById(R.id.textView23);
        TextView textView1 = (TextView) findViewById(R.id.textView24);
        final TextView textView2 = (TextView) findViewById(R.id.textView25);
        for (int j = 0; j < name.size() - 1; j++) {

            textView.setText(textView.getText() + name.get(j) + "\n");
            ;
        }

        textView1.setText("Token number : " + name.get(name.size() - 1));
        // default countdown timer
        if (click) {
            new CountDownTimer(10000, 1000) {

                public void onTick(long millisUntilFinished) {
                    textView2.setText("Time remaining: " + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    textView2.setText("Your order is ready!!!");
                }
            }.start();
        }

//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
////                Toast.makeText(this, "Order Cancelled " , Toast.LENGTH_LONG).show();
//                myRef.child(refKey).removeValue();
//                selection.clear();
//                for (int i = 0; i < maingrid.getChildCount(); i++) {
//
//                    final CardView cardView = (CardView) maingrid.getChildAt(i);
//                    cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
//                }
//                // Code here executes on main thread after user presses button
//            }
//        });

//        Toast.makeText(this, "Order Placed " + name, Toast.LENGTH_LONG).show();

    }



//    public void onClickBtn(View v)
//    {
//        if (v.getId() == R.id.orderbutton3 &&  !refKey.isEmpty() ) {
//
//
//        }
//    }
}
