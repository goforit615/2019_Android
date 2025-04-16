package com.example.solution_chap02_07;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btnShow, btnOpenHomepage;
    RadioGroup rgAndroid;
    RadioButton rbtnOreo, rbtnPie;
    ImageView ivAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("좀 그럴듯한 앱");

        editText = (EditText) findViewById(R.id.editText);
        btnShow = (Button) findViewById(R.id.btnShow);
        btnOpenHomepage = (Button) findViewById(R.id.btnOpenHomepage);
        rbtnOreo = (RadioButton) findViewById(R.id.rbtnOreo);
        rbtnPie = (RadioButton) findViewById(R.id.rbtnPie);
        ivAndroid = (ImageView) findViewById(R.id.ivAndroid);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btnOpenHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
                startActivity(mIntent);
            }
        });
/*
        rgAndroid.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (rgAndroid.getCheckedRadioButtonId()) {
                    case R.id.rbtnOreo:
                        ivAndroid.setImageResource(R.drawable.oreo); break;
                    case R.id.rbtnPie:
                        ivAndroid.setImageResource(R.drawable.pie);  break;
                }
            }
        });
*/
        rbtnPie.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ivAndroid.setImageResource(R.drawable.pie);
            }
        });

        rbtnOreo.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ivAndroid.setImageResource(R.drawable.oreo);
            }
        });
    }
}
