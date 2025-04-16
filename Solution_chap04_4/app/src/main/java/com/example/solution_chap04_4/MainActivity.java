package com.example.solution_chap04_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch swiStart;
    TextView tvLikeAndroid;
    RadioGroup rgroupAndroid;
    RadioButton rbNougat, rbOreo, rbPie;
    ImageView imgvAndroid;
    Button btnExit, btnReset;

    private void initRef() {
        swiStart = (Switch) findViewById(R.id.swiStart);
        tvLikeAndroid = (TextView) findViewById(R.id.tvLikeAndroid);
        rgroupAndroid = (RadioGroup) findViewById(R.id.rgroupAndroid);
        rbNougat = (RadioButton) findViewById(R.id.rbNougat);
        rbOreo = (RadioButton) findViewById(R.id.rbOreo);
        rbPie = (RadioButton) findViewById(R.id.rbPie);
        imgvAndroid = (ImageView) findViewById(R.id.imgvAndroid);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnReset = (Button) findViewById(R.id.btnReset);
    }

    private void setInvisibleWidgets() {
        tvLikeAndroid.setVisibility(View.INVISIBLE);
        rgroupAndroid.setVisibility(View.INVISIBLE);
        imgvAndroid.setVisibility(View.INVISIBLE);
        btnExit.setVisibility(View.INVISIBLE);
        btnReset.setVisibility(View.INVISIBLE);

        swiStart.setChecked(false); //switch set false!
        rgroupAndroid.clearCheck(); //all radio button set false!
        imgvAndroid.setImageResource(0); //image view reset!
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("안드로이드 사진 보기");

        initRef();

        swiStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (swiStart.isChecked()) {
                    tvLikeAndroid.setVisibility(View.VISIBLE);
                    rgroupAndroid.setVisibility(View.VISIBLE);
                    imgvAndroid.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                } else {
                    setInvisibleWidgets();
                }
            }
        });

        rgroupAndroid.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (rgroupAndroid.getCheckedRadioButtonId()) {
                    case R.id.rbNougat:
                        imgvAndroid.setImageResource(R.drawable.nougat); break;
                    case R.id.rbOreo:
                        imgvAndroid.setImageResource(R.drawable.oreo); break;
                    case R.id.rbPie:
                        imgvAndroid.setImageResource(R.drawable.pie); break;
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setInvisibleWidgets();
            }
        });
    }
}
