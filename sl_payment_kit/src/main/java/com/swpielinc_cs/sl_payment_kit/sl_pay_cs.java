package com.swpielinc_cs.sl_payment_kit;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;


public class sl_pay_cs {
    private static String result1 = "";
    public static void slTrnReq(String order_no, String amount, String currency, String meTransReqType, String recurPeriod, String recurDay, String numberRecurring, String mid, String enckey, String tid,
                                String addField1, String addField2, String addField3, String addField4, String addField5, String addField6, String addField7, String addField8,String responseUrl, Activity activity){

        String plain_txt = "{\"id\":0,\"orderNo\":\""+order_no+"\",\"totalAmount\":\""+amount+"\",\"currencyName\":\""+currency+"\",\"meTransReqType\":\""+meTransReqType+"\",\"recurringPeriod\":\""+recurPeriod+"\",\"recurringDay\":\""+recurDay+"\",\"noOfRecurring\":\""+numberRecurring+"\",\"mid\":\""+mid+"\",\"encryptionKey\":\""+enckey+"\",\"addField1\":\""+addField1+"\",\"addField2\":\""+addField2+"\",\"addField3\":\""+addField3+"\",\"addField4\":\""+addField4+"\",\"addField5\":\""+addField5+"\",\"addField6\":\""+addField6+"\",\"addField7\":\""+addField7+"\",\"addField8\":\""+addField8+"\",\"responseUrl\":\""+responseUrl+"\",\"tid\":\""+tid+"\"}";
        try {
            result1 = hifbiuebuid.encrypt(plain_txt,enckey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        activity.startActivity(new Intent(activity, iwfhwgiuf.class).putExtra("data",result1).putExtra("mid",mid).putExtra("reqType","slTrnReq"));
    }

    public static void slMotoTrnReq(String order_no, String amount, String currency, String meTransReqType, String recurPeriod, String recurDay, String numberRecurring, String mid, String enckey, String tid,
                                String addField1, String addField2, String addField3, String addField4, String addField5, String addField6, String addField7, String addField8,String responseUrl,String expirydate,String cvv,String pan,String creditName,String creditEmailId,String creditMobileNo, Activity activity){

       String plain_txt = "{\"id\":0,\"orderNo\":\""+order_no+"\",\"totalAmount\":\""+amount+"\",\"currencyName\":\""+currency+"\",\"meTransReqType\":\""+meTransReqType+"\",\"recurringPeriod\":\""+recurPeriod+"\",\"recurringDay\":\""+recurDay+"\",\"noOfRecurring\":\""+numberRecurring+"\",\"mid\":\""+mid+"\",\"encryptionKey\":\""+enckey+"\",\"addField1\":\""+addField1+"\",\"addField2\":\""+addField2+"\",\"addField3\":\""+addField3+"\",\"addField4\":\""+addField4+"\",\"addField5\":\""+addField5+"\",\"addField6\":\""+addField6+"\",\"addField7\":\""+addField7+"\",\"addField8\":\""+addField8+"\",\"responseUrl\":\""+responseUrl+"\",\"tid\":\""+tid+"\",\"expirydate\":\""+expirydate+"\",\"cvv\":\""+cvv+"\",\"pan\":\""+pan+"\",\"creditName\":\""+creditName+"\",\"creditEmailId\":\""+creditEmailId+"\",\"creditMobileNo\":"+creditMobileNo+"}";
        try {
            result1 = hifbiuebuid.encrypt(plain_txt,enckey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("Add",plain_txt);
        Log.d("Add",result1);
        activity.startActivity(new Intent(activity, iwfhwgiuf.class).putExtra("data",result1).putExtra("mid",mid).putExtra("reqType","slMotoTrnReq"));
    }
}
