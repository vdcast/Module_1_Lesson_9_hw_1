package com.example.modul_1_zaniatie_9_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MYLOG", "Main thread started.");

        new MyThread();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d("MYLOG", "Main thread finished.");


        Account myAccount = new Account("Valeryi",0);

        try {
            new Payment(myAccount,100);
            Thread.sleep(1000);
            new Payment(myAccount,100);
            Thread.sleep(1000);
            new Payment(myAccount,100);
            Thread.sleep(1000);
            new Payment(myAccount,100);
            Thread.sleep(1000);
            new Payment(myAccount,100);
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
}