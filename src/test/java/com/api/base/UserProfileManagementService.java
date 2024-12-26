package com.api.base;

import com.api.models.request.LoginRequest;
import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService{

    private static final String BASE_PATH ="/api/users/";

    public Response getprofile(String token){
        setAuthToken(token);
        return getRequest(BASE_PATH+"profile");
    }


}
