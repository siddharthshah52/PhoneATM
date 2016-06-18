package com.hackathon.phoneatm.api;

import java.util.List;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;

/**
 * Created by sandz on 6/18/16.
 */
public interface PaymentAPI {

    @GET("/api/payments/")
    public Call<List<PaymentRequest>> getPaymentRequest(@Header("Authorization") String authorization);

    @GET("/api/accepted_payments/")
    public Call<List<UserAcceptedPayment>> getUserAcceptedPayment(@Header("Authorization") String authorization);

    @FormUrlEncoded
    @POST("/api/accepted_payments/")
    public Call<Integer> addExpenses(@Header("Authorization") String authorization,
                                     @Field("amount") String amount,
                                     @Field("latitude") double latitude,
                                     @Field("longitude") double longitude,
                                     @Field("token") String token

    );

//    @FormUrlEncoded
//    @POST("/api/action/delete/")
//    public Call<Integer> addDeleteAction(@Header("Authorization") String authorization, @Field("billtype") String billtype);

}
