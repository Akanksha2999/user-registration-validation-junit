package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationValidationTest {
    private UserRegistrationValidation userRegistrationValidation;

    @Before
    public void setup() {
        userRegistrationValidation = new UserRegistrationValidation();
    }

    @Test
    public void validateFirstNameTest() {
        try {
            boolean actualOutput = userRegistrationValidation.validateFirstName("Akanksha");
            Assert.assertTrue(actualOutput);
        } catch (UserRegistrationValidationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void validateLastNameTest() {
        try {
            boolean actualOutput = userRegistrationValidation.validateLastName("Jadhav");
            Assert.assertTrue(actualOutput);
        } catch (UserRegistrationValidationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void validateEmailIdTest() {
        try {
            boolean actualOutput = userRegistrationValidation.validateEmailId("akankshajadhav2999@gmail.com");
            Assert.assertTrue(actualOutput);
        } catch (UserRegistrationValidationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void validateMobileNumberTest() {
        try {
            boolean actualOutput = userRegistrationValidation.validateMobileNumber("+91 8828166460");
            Assert.assertTrue(actualOutput);
        } catch (UserRegistrationValidationException e) {
            System.out.println(e);
        }
    }


    @Test
    public void validatePasswordTest() {
        try {
            boolean actualOutput = userRegistrationValidation.validatePassword("AkankshaJadhav@99");
            Assert.assertTrue(actualOutput);
        } catch (UserRegistrationValidationException e) {
            System.out.println(e);
        }

    }
}
