package com.example.project5_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //LinearLayout을 생성함
        //1. LinearLayout의 width와 height를 지정함
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        //2. LinearLayout을 Context를 이용해 생성하고
        LinearLayout baseLayout = new LinearLayout(this);

        //3. LinearLayout의 orientation과 background를 지정
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0, 255, 0));

        //4. ContentView에 baseLayout과 params를 붙임
        setContentView(baseLayout, params);

        //버튼 생성
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn); //주목!

        //버튼 이벤트 리스너 등록
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
