package com.example.consumirapirest.Models.remote;

import com.example.consumirapirest.interfaces.ImagenApi;

public class ApiUtils {
    private ApiUtils() {}
    public static final String BASE_URL = "http://192.168.2.114:8082/";
    public static ImagenApi getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(ImagenApi.class);
    }
}
