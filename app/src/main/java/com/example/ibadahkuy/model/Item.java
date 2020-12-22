package com.example.ibadahkuy.model;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("jenis")
    private String jenis;

    @SerializedName("nama")
    private String nama;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("id")
    private Integer id;

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    public String getLatitude(){
        return latitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    public String getLongitude(){
        return longitude;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}