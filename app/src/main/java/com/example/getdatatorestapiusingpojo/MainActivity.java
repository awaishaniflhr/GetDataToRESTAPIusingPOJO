package com.example.getdatatorestapiusingpojo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);

        apiInterface.getposts().enqueue(new Callback<List<PostPojo>>() {
        @Override
        public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response) {
        }

        @Override
        public void onFailure(Call<List<PostPojo>> call, Throwable t) {
        }
        });
    }
}