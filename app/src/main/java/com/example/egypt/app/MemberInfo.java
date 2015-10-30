package com.example.egypt.app;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MemberInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface tf_regular = Typeface.createFromAsset(getAssets(), "NotoKufiArabic-Regular.ttf");
        Typeface tf_bold = Typeface.createFromAsset(getAssets(), "NotoKufiArabic-Bold.ttf");

        TextView tv_age = (TextView) findViewById(R.id.tv_age);
        tv_age.setTypeface(tf_regular);
        TextView tv_edu_state = (TextView) findViewById(R.id.tv_edu_state);
        tv_edu_state.setTypeface(tf_regular);
        TextView tv_familyHeadRelation = (TextView) findViewById(R.id.tv_familyHeadRelation);
        tv_familyHeadRelation.setTypeface(tf_regular);
        TextView tv_marital_state = (TextView) findViewById(R.id.tv_marital_state);
        tv_marital_state.setTypeface(tf_regular);
        TextView tv_religion = (TextView) findViewById(R.id.tv_religion);
        tv_religion.setTypeface(tf_regular);
        TextView tv_sex = (TextView) findViewById(R.id.tv_sex);
        tv_sex.setTypeface(tf_regular);
        TextView tv_nationality = (TextView) findViewById(R.id.tv_nationality);
        tv_nationality.setTypeface(tf_regular);
        TextView tv_where = (TextView) findViewById(R.id.tv_where);
        tv_where.setTypeface(tf_regular);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
