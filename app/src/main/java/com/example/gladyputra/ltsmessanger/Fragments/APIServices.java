package com.example.gladyputra.ltsmessanger.Fragments;

import com.example.gladyputra.ltsmessanger.Notifications.MyResponse;
import com.example.gladyputra.ltsmessanger.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIServices {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAHFHmY8s:APA91bHUFpSaGRApmJeLclpT9uBvsGRbwVrFRf_PnEXRUE5Lzf84RbI4AeXTWML0vKaIFiPXVOA50j8pN6IjmNFw9D8BSrEfDZ-F4wt0860ycKMkNrZ-RejOvsjUm4jV7bwrbN3gcsJW"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
