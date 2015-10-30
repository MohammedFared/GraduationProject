package com.example.egypt.app;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    ActionBar actionBar;
    ViewPager pager;
    ViewTabAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"خصائص الاسرة","الظروف السكنيه","الانشطه الزراعيه"};
    int Numboftabs =3;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface tf_regular = Typeface.createFromAsset(getAssets(), "NotoKufiArabic-Regular.ttf");
        Typeface tf_bold = Typeface.createFromAsset(getAssets(), "NotoKufiArabic-Bold.ttf");

        TextView tv_familyHead = (TextView) findViewById(R.id.tv_familyHead);
        TextView tv_familyHeadName = (TextView) findViewById(R.id.tv_familyHeadName);
        TextView tv_male = (TextView) findViewById(R.id.tv_male);
        TextView tv_female = (TextView) findViewById(R.id.tv_female);
        TextView tv_numOfMales = (TextView) findViewById(R.id.tv_numOfMales);
        TextView tv_numOfFemales = (TextView) findViewById(R.id.tv_numOfFemales);

        tv_familyHead.setTypeface(tf_regular);
        tv_familyHeadName.setTypeface(tf_bold);
        tv_male.setTypeface(tf_regular);
        tv_female.setTypeface(tf_regular);
        tv_numOfFemales.setTypeface(tf_bold);
        tv_numOfMales.setTypeface(tf_bold);


        //Taps Handle

        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewTabAdapter(getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pagers);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextScreen(view);
            }
        });

    }

    public void nextScreen(View view){
        Intent intent=new Intent(this, MemberInfo.class);
        startActivity(intent);
    }
}
