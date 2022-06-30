package com.example.modul_1_zaniatie_9_dom_1;

import android.util.Log;

import java.util.Random;

public class Payment implements Runnable{
    final Account account;
    int moneyOfTransaction;

    public Payment(Account account, int moneyOfTransaction){
        this.account = account;
        this.moneyOfTransaction = moneyOfTransaction;
        new Thread(this).start();
    }


    @Override
    public void run() {
        synchronized(account){
            Log.d("MYLOG", "New payment");
            int oldBalance = account.balance;
            try {
                account.balance += moneyOfTransaction;
                Thread.sleep(new Random().nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d("MYLOG", "Balance: " + oldBalance + " + " + moneyOfTransaction + " = " + account.balance);
        }
    }
}
