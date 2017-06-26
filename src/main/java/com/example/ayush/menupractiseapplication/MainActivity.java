package com.example.ayush.menupractiseapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //now we inflate the menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        //menu has been inflated
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        tv1 = (TextView) findViewById(R.id.tv_1);
        int id = item.getItemId();
        //gets id of the item chosen
        if(id == R.id.red){
            //if the option chosen is red then the textview becomes red in colour
            tv1.setTextColor(getColor(R.color.Red));
            return true;
        }
        if (id == R.id.Blue){
            //if the option chosen is blue then the textview becomes blue in colour
            tv1.setTextColor(getColor(R.color.Blue));
            return true;
        }
        if (id == R.id.Green){
            //if the option chosen is green then the textview becomes green in colour
            tv1.setTextColor(getColor(R.color.green));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
