package com.swpielinc_cs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.swpielinc_cs.sl_payment_kit.sl_pay_cs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sl_pay_cs.slMotoTrnReq("1575612661360341","24517","INR","S","","","","SL0000000000003","B0D69595E51048E29AF85E7B9A75EBA8","10000003","","","","","","","","","","2012","123","4111 1111 1111 1111","Test","test@yahoo.in","9874563214",MainActivity.this);
    }
}
