package com.example.consumirapirest.interfaces;

import com.example.consumirapirest.Models.SubirImagen;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ImagenApi {
    @POST("api/Imagen")
    @FormUrlEncoded
    public Call<String> SubirImagenApi(@Field("imagenbase") String imagenbase, @Field("nombreimagen") String nombreimagen, @Field("nombrecarpeta") String nombrecarpeta,@Field("origen") String origen);
    //public Call<String> SubirImagenApi(@Body SubirImagen subirImagen);

}
