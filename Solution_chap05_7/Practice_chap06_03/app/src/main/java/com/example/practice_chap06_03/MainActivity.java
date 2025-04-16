package com.example.practice_chap06_03;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation") //아이스크림 샌드위치 버전 이후에 사용하면 경고 발생을 막음
public class MainActivity extends TabActivity { //TabActivity를 상속
    TabHost tabHost;
    TabSpec tabSpecPuppy, tabSpecKitty, tabSpecRabbit, tabSpecHorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = getTabHost();

        tabSpecPuppy = tabHost.newTabSpec("PUPPY").setIndicator("강아지"); //탭에 태그와 보일 이름 지정
        tabSpecPuppy.setContent(R.id.tabPuppy); //TabSpec을 Tab과 연결함
        tabHost.addTab(tabSpecPuppy); //Tab을 TabHost에 부착함

        tabSpecKitty = tabHost.newTabSpec("KITTY").setIndicator("고양이"); //탭에 태그와 보일 이름 지정
        tabSpecKitty.setContent(R.id.tabKitty); //TabSpec을 Tab과 연결함
        tabHost.addTab(tabSpecKitty); //Tab을 TabHost에 부착함

        tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼"); //탭에 태그와 보일 이름 지정
        tabSpecRabbit.setContent(R.id.tabRabbit); //TabSpec을 Tab과 연결함
        tabHost.addTab(tabSpecRabbit); //Tab을 TabHost에 부착함

        tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("말"); //탭에 태그와 보일 이름 지정
        tabSpecHorse.setContent(R.id.tabHorse); //TabSpec을 Tab과 연결함
        tabHost.addTab(tabSpecHorse); //Tab을 TabHost에 부착함

        tabHost.setCurrentTab(0); //강아지부터 먼저 보임!
    }
}
