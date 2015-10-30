package com.example.egypt.app;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        Typeface tf_regular = Typeface.createFromAsset(getAssets(), "NotoKufiArabic-Regular.ttf");

        TextView tv_codeEntering = (TextView) findViewById(R.id.tv_codeEntering);
        EditText et_codeEntering = (EditText) findViewById(R.id.et_codeEntering);
        Button b_codeEntering = (Button) findViewById(R.id.b_codeEntering);

        tv_codeEntering.setTypeface(tf_regular);
        et_codeEntering.setTypeface(tf_regular);
        b_codeEntering.setTypeface(tf_regular);
    }
    
    public void nextScreen(View view){
        EditText et_codeEntering = (EditText) findViewById(R.id.et_codeEntering);
        if(et_codeEntering.getText().toString().isEmpty()==true){
            Snackbar.make(view, "برجاء ادخال الكود اولا", Snackbar.LENGTH_LONG).show();
        }
        else{
            Intent intent= new Intent(this, Main.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_code, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
