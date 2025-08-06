package com.Tumton.hotelapp.activies;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.Tumton.hotelapp.activies.data.local.UserLocalData;

public class AuthenticatorActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        if (UserLocalData.setAccessToken(this).isEmpty()){
            Intent intent = new Intent(AuthenticatorActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
