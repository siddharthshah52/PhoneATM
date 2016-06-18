package com.hackathon.phoneatm.api;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by sandz on 02/27/16.
 */
public class APIUtils {
    Activity activity;


    public APIUtils(Activity activity) {
        this.activity = activity;
    }

    public String getAuthorizationToken() {
        SharedPreferences settings = PreferenceManager
                .getDefaultSharedPreferences(activity.getApplicationContext());

        String auth_token = settings.getString("auth_token", null);
        return "fde0e7b64e03df6a621954faa63eeed457101c1c";
    }

    public String getHeaderAuthorizationToken() {
        return " Token " + getAuthorizationToken();
    }

    public void viewPayments() {

        Log.i("hello", "hello");
//        final List<PaymentRequest> retVal;
        Thread x = new Thread(new Runnable() {

            @Override
            public void run() {
                Retrofit restAdapter = new Retrofit.Builder().baseUrl(RestAdapter.API).
                        addConverterFactory(GsonConverterFactory.create()).build();
                PaymentAPI paymentAPI = restAdapter.create(PaymentAPI.class);


                Call<List<PaymentRequest>> paymentsCall = paymentAPI.getPaymentRequest(getHeaderAuthorizationToken());

                paymentsCall.enqueue(new Callback<List<PaymentRequest>>() {

                    @Override
                    public void onResponse(Response<List<PaymentRequest>> response, Retrofit retrofit) {
                        Log.i("+==================+", response.message());
                        List<PaymentRequest> result = response.body();
                        for (PaymentRequest pr : result) {
                            Log.i("payment info", pr.getAmount() + "");
                        }

                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
            }
        });
        x.start();

    }

    public void getUserAcceptedPayment() {
        Thread x = new Thread(new Runnable() {

            @Override
            public void run() {
                Retrofit restAdapter = new Retrofit.Builder().baseUrl(RestAdapter.API).
                        addConverterFactory(GsonConverterFactory.create()).build();
                PaymentAPI paymentAPI = restAdapter.create(PaymentAPI.class);
                Call<List<UserAcceptedPayment>> paymentsCall = paymentAPI.getUserAcceptedPayment(getHeaderAuthorizationToken());
                paymentsCall.enqueue(new Callback<List<UserAcceptedPayment>>() {
                    @Override
                    public void onResponse(Response<List<UserAcceptedPayment>> response, Retrofit retrofit) {
                        Log.i("+==================+", response.message());
                        List<UserAcceptedPayment> result = response.body();
                        for (UserAcceptedPayment pr : result) {
                            Log.i("payment info", pr.getAmount() + "");
                        }
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
            }
        });
        x.start();

    }
}

