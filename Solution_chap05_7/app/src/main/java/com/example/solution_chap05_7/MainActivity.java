package com.example.solution_chap05_7;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //기본 LinearLayout 설정
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        final LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        setContentView(baseLayout, params);

        setTitle("연습문제 5-7");

        //위쪽 LinearLayout 설정
        final LinearLayout.LayoutParams paramsTop = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        paramsTop.weight = 1.0f;

        final LinearLayout topLayout = new LinearLayout(this);
        topLayout.setOrientation(LinearLayout.HORIZONTAL);

        baseLayout.addView(topLayout, paramsTop);

        //아래쪽 LinearLayout 설정
        final LinearLayout.LayoutParams paramsBottom = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        paramsBottom.weight = 1.0f;

        final LinearLayout bottomLayout = new LinearLayout(this);
        baseLayout.setBackgroundColor(Color.rgb(139, 0, 255));

        baseLayout.addView(bottomLayout, paramsBottom);

        //topLayout에서 왼쪽 LinearLayout 설정
        final LinearLayout.LayoutParams paramsTopLeft = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        paramsTopLeft.weight = 1.0f;

        final LinearLayout topLeftLayout = new LinearLayout(this);
        topLeftLayout.setBackgroundColor(Color.rgb(255, 0, 0));

        topLayout.addView(topLeftLayout, paramsTopLeft);

        //topLayout에서 오른쪽 LinearLayout 설정
        final LinearLayout.LayoutParams paramsTopRight = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        paramsTopRight.weight = 1.0f;

        final LinearLayout topRightLayout = new LinearLayout(this);
        topRightLayout.setOrientation(LinearLayout.VERTICAL);

        topLayout.addView(topRightLayout, paramsTopRight);

        //topRightLayout에서 위쪽 LinearLayout 설정
        final LinearLayout.LayoutParams paramsTopRightTop = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        paramsTopRightTop.weight = 1.0f;

        final LinearLayout topRightTopLayout = new LinearLayout(this);
        topRightTopLayout.setBackgroundColor(Color.rgb(255, 255, 0));

        topRightLayout.addView(topRightTopLayout, paramsTopRightTop);

        //topRightLayout에서 아래쪽 LinearLayout 설정
        final LinearLayout.LayoutParams paramsTopRightBottom = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        paramsTopRightBottom.weight = 1.0f;

        final LinearLayout topRightBottomLayout = new LinearLayout(this);
        topRightBottomLayout.setBackgroundColor(Color.rgb(0, 0, 0));

        topRightLayout.addView(topRightBottomLayout, paramsTopRightBottom);

    }
}
