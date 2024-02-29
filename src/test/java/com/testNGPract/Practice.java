package com.testNGPract;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {

    @DataProvider(name="loginTestData")
    String[][] loginData(){
        String[][] data = {
                            {"user1", "pass1"},
                            {"user2", "pass2"},
                            {"user3", "pass3"},
                          };
        return data;
    }

    @Test(dataProvider = "loginTestData")
    public void test(String username, String password){
        System.out.println(username+" logged in using "+password);
    }
}

