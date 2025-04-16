package com.example.solution_chap05_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayoutPurple, linearLayoutBlue, linearLayoutYellow, linearLayoutBlack;

    private String getWidthHeight(LinearLayout linearLayout) {
        String width = "폭: " + linearLayout.getWidth();
        String height = "너비: " + linearLayout.getHeight();

        return width + " " + height;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제 5-6");

        linearLayoutPurple = (LinearLayout) findViewById(R.id.linearLayoutPurple);
        linearLayoutBlue = (LinearLayout) findViewById(R.id.linerLayoutBlue);
        linearLayoutYellow = (LinearLayout) findViewById(R.id.linearLayoutYellow);
        linearLayoutBlack = (LinearLayout) findViewById(R.id.linearLayoutBlack);

        linearLayoutPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getWidthHeight(linearLayoutPurple), Toast.LENGTH_SHORT).show();
            }
        });

        linearLayoutBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getWidthHeight(linearLayoutBlue), Toast.LENGTH_SHORT).show();
            }
        });

        linearLayoutYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getWidthHeight(linearLayoutYellow), Toast.LENGTH_SHORT).show();
            }
        });

        linearLayoutBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getWidthHeight(linearLayoutBlack), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
