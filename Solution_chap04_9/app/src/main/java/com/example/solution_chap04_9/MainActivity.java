package com.example.solution_chap04_9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnRotation;
    ImageView img1;
    float degree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제 4-9");

        btnRotation = (Button) findViewById(R.id.btnRotation);
        img1 = (ImageView) findViewById(R.id.img1);
        degree = (float) 0.0;

        img1.setImageResource(R.drawable.cat);

        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree += (float) 10.0;
                if (degree > 360) {
                    degree = (float) 0.0;
                }

                img1.setRotation(degree);
            }
        });
    }
}
