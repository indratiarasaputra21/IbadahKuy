package com.example.ibadahkuy.res;

import com.example.ibadahkuy.model.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("purwakarta/tempatibadah")
    Call<Model> getData();
}
