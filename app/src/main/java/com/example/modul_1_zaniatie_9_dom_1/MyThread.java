package com.example.modul_1_zaniatie_9_dom_1;

import android.util.Log;

public class MyThread implements Runnable{

    public MyThread(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        Log.d("MYLOG", "Background thread started.");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d("MYLOG", "Background thread finished.");
    }
}
