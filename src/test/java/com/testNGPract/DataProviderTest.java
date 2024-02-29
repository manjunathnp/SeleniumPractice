package com.testNGPract;

import jdk.jfr.MetadataDefinition;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {
    @DataProvider(name = "loginTestData")
    String[][] loginData() {
        String data[][] = {
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"},
                {"user4", "pass4"},
                {"user5", "pass5"}
        };
        return data;
    }

    @Test(dataProvider = "loginTestData")
    public void loginTest1(String username, String password){
        System.out.println(username+" logged in using "+password);
    }
}
