package com.example.getdatatorestapiusingpojo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance<BASEURl> {
    private static Retrofit retrofit;
    private static final String BASEURl = "https://jsonplaceholder.typicode.com/posts";

    public static Retrofit getRetrofit(){
        if(retrofit == null){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASEURl).addConverterFactory(GsonConverterFactory
                .create()).build();
        }
        return retrofit;
    }

}
