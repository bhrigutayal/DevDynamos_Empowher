package com.android.Safher.api;

import com.android.Safher.model.NotificationSenderModel;
import com.android.Safher.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=XXXXXXXXXXXXXXXXXXXXXXXXXXXX" // Replace with your server key from Firebase Console
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
