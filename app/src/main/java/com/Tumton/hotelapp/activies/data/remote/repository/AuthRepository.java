package com.Tumton.hotelapp.activies.data.remote.repository;

import com.Tumton.hotelapp.activies.data.network.ApiClient;
import com.Tumton.hotelapp.activies.data.network.ApiNetwork;
import com.Tumton.hotelapp.activies.data.remote.models.request.LoginRequest;
import com.Tumton.hotelapp.activies.data.remote.models.response.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthRepository {
    private final ApiNetwork apiNetwork;
    public AuthRepository(){
        apiNetwork = ApiClient.getClient().create(ApiNetwork.class);
    }
    public void login(String username, String password, LoginCallBack loginCallBack){
        try {


            LoginRequest loginRequest = new LoginRequest();
            loginRequest.getPhoneNumber(username);
            loginRequest.setPassword(password);
            loginCallBack.onLoading();
            apiNetwork.login(loginRequest).enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        loginCallBack.onSuccess(response.body());
                    } else {
                        loginCallBack.onError("You username and password incorrect");
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    loginCallBack.onError("General error " + t.getMessage());
                }
            });
        }catch (Throwable e){
            loginCallBack.onError(e.getMessage());
        }
    }
}
