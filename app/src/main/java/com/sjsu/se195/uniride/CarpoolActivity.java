package com.sjsu.se195.uniride;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CarpoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpool);
        System.out.println("I m in the carpool Activity");
    }
}
