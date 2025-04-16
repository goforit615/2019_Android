package com.example.practice_chap04_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvResult;

    //Solution_chap04_03에서 또 다뤄짐!
    private void initRef() {
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    private int[] getEditNumber() {
        int[] result = new int[2];

        result[0] = Integer.parseInt(editText1.getText().toString());
        result[1] = Integer.parseInt(editText2.getText().toString());

        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");
        initRef();

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int[] number = getEditNumber();
                tvResult.setText("계산 결과 : " + (number[0] + number[1]));
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int[] number = getEditNumber();
                tvResult.setText("계산 결과 : " + (number[0] - number[1]));
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int[] number = getEditNumber();
                tvResult.setText("계산 결과 : " + (number[0] * number[1]));
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int[] number = getEditNumber();
                tvResult.setText("계산 결과 : " + (number[0] / number[1]));
                return false;
            }
        });

    }
}
