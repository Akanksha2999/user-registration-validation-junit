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


    //Validation for first name in positive scenario
    @Test
    public void validateFirstNameForPositiveScenarioTest() throws UserRegistrationValidationException {
        boolean actualOutput = userRegistrationValidation.validateFirstName("Akanksha");
        Assert.assertTrue(actualOutput);
    }

    //Validation for first name in negative scenario
    @Test
    public void validateFirstNameForNegativeScenarioTest() {
        try {
            userRegistrationValidation.validateFirstName("akanksha");
        } catch (UserRegistrationValidationException exception) {
            Assert.assertEquals("Entered invalid first name", exception.getMessage());
        }
    }

    //Validation for last name in positive scenario
    @Test
    public void validateLastNameForPositiveScenarioTest() throws UserRegistrationValidationException {
        boolean actualOutput = userRegistrationValidation.validateLastName("Jadhav");
        Assert.assertTrue(actualOutput);
    }

    //Validation for last name in negative scenario
    @Test
    public void validateLastNameForNegativeScenarioTest() {
        try {
            userRegistrationValidation.validateLastName("jadhav");
        } catch (UserRegistrationValidationException exception) {
            Assert.assertEquals("Entered invalid last name", exception.getMessage());
        }
    }

    //Validation for email id in positive scenario
    @Test
    public void validateEmailIdForPositiveScenarioTest() throws UserRegistrationValidationException {
        boolean actualOutput = userRegistrationValidation.validateEmailId("akankshajadhav2999@gmail.com.in");
        Assert.assertTrue(actualOutput);
    }

    //Validation for email id in negative scenario
    @Test
    public void validateEmailIdForNegativeScenarioTest() {
        try {
            userRegistrationValidation.validateEmailId("akankshajadhav2999@gmail");
        } catch (UserRegistrationValidationException exception) {
            Assert.assertEquals("Entered invalid email id", exception.getMessage());
        }
    }

    //Validation for mobile number in positive scenario
    @Test
    public void validateMobileNumberForPositiveScenarioTest() throws UserRegistrationValidationException {
        boolean actualOutput = userRegistrationValidation.validateMobileNumber("+91 8828166460");
        Assert.assertTrue(actualOutput);
    }

    //Validation for mobile number in negative scenario
    @Test
    public void validateMobileNumberForNegativeScenarioTest() {
        try {
            userRegistrationValidation.validateMobileNumber("+9 8828166460");
        } catch (UserRegistrationValidationException exception) {
            Assert.assertEquals("Entered invalid mobile number", exception.getMessage());
        }
    }

    //Validation for password in positive scenario
    @Test
    public void validatePasswordForPositiveScenarioTest() throws UserRegistrationValidationException {
        boolean actualOutput = userRegistrationValidation.validatePassword("AkankshaJadhav@99");
        Assert.assertTrue(actualOutput);
    }

    //Validation for password in negative scenario
    @Test
    public void validatePasswordForNegativeScenarioTest() {
        try {
            userRegistrationValidation.validatePassword("AkankshaJadhav@");
        } catch (UserRegistrationValidationException exception) {
            Assert.assertEquals("Entered invalid password", exception.getMessage());
        }
    }
}
