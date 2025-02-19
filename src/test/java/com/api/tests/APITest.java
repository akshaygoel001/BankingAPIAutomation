package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class APITest {

    @Test(enabled = true,priority = 1)
    public void loginTest(){
        AuthService authService = new AuthService();
        Response resp = authService.login(new LoginRequest("test1","Test123456"));
        System.out.println(resp.as(LoginResponse.class).getToken());
    }

    @Test(enabled = true,priority = 2)
    public void signup(){

        SignUpRequest signUpRequest=new SignUpRequest.Builder()
                .userName("test3")
                .email("test2@gmail.com")
                .firstname("test2")
                .lastname("user")
                .mobilenumber("8723456781")
                .passWord("Test12356")
                .build();

        AuthService authService = new AuthService();
        Response resp = authService.signup(signUpRequest);
        System.out.println(resp.prettyPrint());

    }

    @Test(enabled = true,priority = 3)
    public void forgotpassword(){
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("test@gmail.com");
        System.out.println(response.prettyPrint());
    }
    @Test(priority = 4)
    public void profile(){
        AuthService authService = new AuthService();
        Response resp = authService.login(new LoginRequest("test1","Test123456"));
        System.out.println(resp.as(LoginResponse.class).getToken());
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        Response response=userProfileManagementService.getprofile(resp.as(LoginResponse.class).getToken());
        System.out.println(response.prettyPrint());
    }


}
