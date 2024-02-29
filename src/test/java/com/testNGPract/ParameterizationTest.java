package com.testNGPract;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTest {

    @Test
    @Parameters({"username", "password"})
    public void loginTest1(String username, String password){
        System.out.println(username+" logged in using "+password);
    }

    @Test
    @Parameters({"username2", "password2"})
    public void loginTest2(String username, String password){
        System.out.println(username+" logged in using "+password);
    }

}
