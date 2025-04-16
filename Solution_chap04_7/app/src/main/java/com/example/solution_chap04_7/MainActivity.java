package com.example.solution_chap04_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox chkEnabled, chkClickable, chk45Degree;
    Button btn1;

    private void initRef() {
        chkEnabled = (CheckBox) findViewById(R.id.chkEnabled);
        chkClickable = (CheckBox) findViewById(R.id.chkClickable);
        chk45Degree = (CheckBox) findViewById(R.id.chk45Degree);

        btn1 = (Button) findViewById(R.id.btn1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제 4-7");
        initRef();

        chkEnabled.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkEnabled.isChecked()) {
                    btn1.setEnabled(true);
                } else {
                    btn1.setEnabled(false);
                }
            }
        });

        chkClickable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkClickable.isChecked()) {
                    btn1.setClickable(true);
                } else {
                    btn1.setClickable(false);
                }
            }
        });

        chk45Degree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk45Degree.isChecked()) {
                    btn1.setRotation((float) 45.0);
                } else {
                    btn1.setRotation((float) 0.0);
                }
            }
        });

    }
}
