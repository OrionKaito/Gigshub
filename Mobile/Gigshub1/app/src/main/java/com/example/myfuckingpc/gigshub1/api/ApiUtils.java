package com.example.myfuckingpc.gigshub1.api;


public class ApiUtils {

    public static final String BASE_URL = "http://192.168.1.213:8080";

    public static UserClient getUserClient() {
        return RetrofitClient.getClient(BASE_URL).create(UserClient.class);
    }
    public static CustomerClient getCustomerClient(String token) {
        String bearer_token = "Bearer "+ token;
        return RetrofitClient.createClientWithHeaderToken(BASE_URL, bearer_token).create(CustomerClient.class);
    }

    public static FileUploadService createEventClient(String token) {
        String bearer_token = "Bearer "+ token;
        return RetrofitClient.createClientWithHeaderToken(BASE_URL, bearer_token).create(FileUploadService.class);
    }
}
