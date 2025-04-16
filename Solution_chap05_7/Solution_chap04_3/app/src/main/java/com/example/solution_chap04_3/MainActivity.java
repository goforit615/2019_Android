package com.example.solution_chap04_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView tvResult;

    //Practice_chap04_01에서 더 나아짐!
    private void initRef() {
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMod = (Button) findViewById(R.id.btnMod);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    private double[] getEditNumber() {
        double[] result = new double[2];

        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();

        if (str1.equals("") || str2.equals("")) {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
            return null;
        }

        try {
            result[0] = Double.parseDouble(editText1.getText().toString());
            result[1] = Double.parseDouble(editText2.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
            return null;
        }

        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기(수정)");
        initRef();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] number = getEditNumber();

                if (number == null) {
                    return;
                }

                tvResult.setText("계산 결과 : " + (number[0] + number[1]));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] number = getEditNumber();

                if (number == null) {
                    return;
                }

                tvResult.setText("계산 결과 : " + (number[0] - number[1]));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] number = getEditNumber();

                if (number == null) {
                    return;
                }

                tvResult.setText("계산 결과 : " + (number[0] * number[1]));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] number = getEditNumber();

                if (number == null) {
                    return;
                }

                double result = number[0] / number[1];
                if (Double.isNaN(result) || Double.isInfinite(result)) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    tvResult.setText("계산 결과 : " + result);
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] number = getEditNumber();

                if (number == null) {
                    return;
                }

                double result = number[0] % number[1];
                if (Double.isNaN(result) || Double.isInfinite(result)) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    tvResult.setText("계산 결과 : " + result);
                }
            }
        });
    }
}
