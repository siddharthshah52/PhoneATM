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
//
//    @FormUrlEncoded
//    @POST("/api/expense/add/")
//    public Call<Result> addExpenses(@Header("Authorization") String authorization,
//                                    @Field("amount") String amount,
//                                    @Field("description") String description,
//                                    @Field("billtype") String billtype,
//                                    @Field("currency") String currency,
//                                    @Field("duration") double duration,
//                                    @Field("initial_description") String initBillDesc,
//                                    @Field("amount_delete_keystroke") String amtDelCounts,
//                                    @Field("amount_others_keystroke") String amtEditCounts,
//                                    @Field("description_delete_keystroke") String descDelCounts,
//                                    @Field("description_others_keystroke") String descEditCounts
//
//    );
//
//    @FormUrlEncoded
//    @POST("/api/action/delete/")
//    public Call<Result> addDeleteAction(@Header("Authorization") String authorization, @Field("billtype") String billtype);

}
