package com.example.examples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    int numberPress=0;
    FragmentOne f1=new FragmentOne();
    FragmentSecond f2=new FragmentSecond();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            getSupportFragmentManager().beginTransaction().replace(R.id.frag,f1,"new").commit();
        }


        setContentView(R.layout.activity_main);




    }
    public void change(View view){

        switch (numberPress % 2) {
            case 1: {

                getSupportFragmentManager().beginTransaction().replace(R.id.frag,f1,"new").commit();


                break;
            }
            case 0: {
                getSupportFragmentManager().beginTransaction().replace(R.id.frag,f2,"second").commit();

                break;
            }
        }
        numberPress++;



        }




    }




