package com.example.project5_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {
            R.id.btnNum0, R.id.btnNum1, R.id.btnNum2, R.id.btnNum3, R.id.btnNum4,
            R.id.btnNum5, R.id.btnNum6, R.id.btnNum7, R.id.btnNum8, R.id.btnNum9
    };

    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;

    private void initRef() {
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        for (int i = 0; i < numBtnIDs.length; ++i) {
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        textResult = (TextView) findViewById(R.id.textResult);
    }

    private int[] getEditText() {
        int[] result = new int[2];
        String num1 = edit1.getText().toString();
        String num2 = edit2.getText().toString();

        if (num1.equals("") || num2.equals("")) {
            Toast.makeText(getApplicationContext(), "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
            return null;
        }

        try {
            result[0] = Integer.parseInt(num1);
            result[1] = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "숫자만 입력할 수 있습니다.", Toast.LENGTH_SHORT).show();
            return null;
        }

        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("테이블레이아웃 계산기");
        initRef();

        for (int i = 0; i < numButtons.length; ++i) {
            final int index = i; //주의! 익명 클래스 안에서는 i를 바로 사용하면 실행 오류!

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edit1.isFocused()) {
                        String num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                                      //이전에 있던 String과 새로 누른 버튼 String을 더함
                        edit1.setText(num1);
                    } else if (edit2.isFocused()) {
                        String num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] num = getEditText();
                textResult.setText("계산 결과 : " + (num[0] + num[1]));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] num = getEditText();
                textResult.setText("계산 결과 : " + (num[0] - num[1]));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] num = getEditText();
                textResult.setText("계산 결과 : " + (num[0] * num[1]));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] num = getEditText();
                int result;

                try {
                    result = num[0] / num[1];
                } catch (ArithmeticException e) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                    return;
                }

                textResult.setText("계산 결과 : " + result);
            }
        });

    }
}
