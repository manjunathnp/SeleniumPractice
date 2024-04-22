package com.testNGPract;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.openqa.selenium.remote.DesiredCapabilities.*;

public class DataProviderDemo2 {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
    }
    @DataProvider(name = "loginTestData")
    public Object[][] loginTestDataMethod(){
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"}
        };
    }

    @Test(dataProvider = "loginTestData")
    public void loginTest(String username, String password){
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }
    //@Test
    public void handleSSLCertificateIssues(){
       // DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        //capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

    }

}
