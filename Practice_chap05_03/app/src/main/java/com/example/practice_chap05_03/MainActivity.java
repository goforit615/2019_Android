package com.example.practice_chap05_03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        final LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        setContentView(baseLayout, params);


        final EditText edit = new EditText(this);

        final Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.rgb(255, 255, 0));

        final TextView tv = new TextView(this);
        tv.setTextColor(Color.rgb(139, 0, 255));
        tv.setTextSize((float)20.0);

        baseLayout.addView(edit);
        baseLayout.addView(btn);
        baseLayout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(edit.getText().toString());
            }
        });

    }
}
