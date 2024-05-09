package com.testNGPract;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class DataProviderDemo3 {

    public String randomEmail(){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        Random random=new Random();
        StringBuilder email=new StringBuilder();

        for(int i=0; i<10; i++){
            int index = random.nextInt(alphabets.length());
            email.append(alphabets.charAt(index));
        }
        return new String(email)+"@testemail.com";
    }

    @DataProvider(name = "userTestData")
    public Object[][] userData(){
        return new Object[][]{
                {"Tester", "Testing"}
        };
    }

    @DataProvider(name = "capitalsOfState")
    public Object[][] stateCapitalData(){
        return new Object[][]{
                {"Karnataka", "Bengaluru"},
                {"Telangana", "Hyderabad"},
                {"Maharashtra", "Mumbai"}
        };
    }

    @DataProvider(name = "emailTestData")
    public Object[] emailTestData(){
        return new Object[]{
          "tester@test.com"
        };
    }
    /*public Object[] emailTestData(){
        return new Object[]{
                "test@test.com",
                "test@test2.com"
        };
    }*/
    @Test(dataProvider = "userTestData")
    public void login(String firstName, String lastName){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
    }

    @Test(dataProvider = "capitalsOfState")
    public void stateCapitalsTest(String state, String capital){
        System.out.println("State: "+state);
        System.out.println("Capital: "+capital);
    }

    @Test(dataProvider = "emailTestData")
    public void emailTest(String email){
        System.out.println("Email: "+email);
    }


}
