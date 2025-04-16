package com.example.project4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkStart;
    TextView tvLikePet;
    RadioGroup rgroupPet;
    RadioButton rbPuppy, rbCat, rbRabbit;
    Button btnOK;
    ImageView imgvPet;

    private void initRef() {
        chkStart = (CheckBox) findViewById(R.id.chkStart);
        tvLikePet = (TextView) findViewById(R.id.tvLikePet);
        rgroupPet = (RadioGroup) findViewById(R.id.rgroupPet);
        rbPuppy = (RadioButton) findViewById(R.id.rbPuppy);
        rbCat = (RadioButton) findViewById(R.id.rbRabbit);
        btnOK = (Button) findViewById(R.id.btnOK);
        imgvPet = (ImageView) findViewById(R.id.imgvPet);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진 보기");

        chkStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkStart.isChecked()) {
                    tvLikePet.setVisibility(View.VISIBLE);
                    rgroupPet.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgvPet.setVisibility(View.VISIBLE);
                } else {
                    tvLikePet.setVisibility(View.INVISIBLE);
                    rgroupPet.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgvPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(rgroupPet.getCheckedRadioButtonId()) {
                    case R.id.rbPuppy:
                        imgvPet.setImageResource(R.drawable.puppy); break;
                    case R.id.rbCat:
                        imgvPet.setImageResource(R.drawable.cat); break;
                    case R.id.rbRabbit:
                        imgvPet.setImageResource(R.drawable.rabbit); break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
