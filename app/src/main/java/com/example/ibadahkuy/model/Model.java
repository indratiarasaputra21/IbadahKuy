package com.example.ibadahkuy.model;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class Model {

    @SerializedName("tempat_ibadah")
    private ArrayList<Item> hasil;

    public void setHasil(ArrayList<Item> hasil){
        this.hasil = hasil;
    }

    public ArrayList<Item> getHasil(){
        return hasil;
    }
}
