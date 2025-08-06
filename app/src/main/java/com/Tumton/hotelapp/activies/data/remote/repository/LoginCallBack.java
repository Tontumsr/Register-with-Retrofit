package com.Tumton.hotelapp.activies.data.remote.repository;

import com.Tumton.hotelapp.activies.data.remote.models.response.LoginResponse;

public interface LoginCallBack {
    void onLoading();
    void onSuccess(LoginResponse response);
    void onError(String message);
}
