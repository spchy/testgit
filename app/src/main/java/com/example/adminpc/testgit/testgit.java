package com.example.adminpc.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class testgit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testgit);
        try {
            clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
