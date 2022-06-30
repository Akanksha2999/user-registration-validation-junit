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
    public void validateFirstNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateFirstName("Akanksha");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateFirstNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateFirstName("akanksha");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateLastName("Jadhav");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateLastName("jadhav");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateEmailId("akankshajadhav2999@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailIdForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateEmailId("akankshajadhav2999gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateMobileNumber("+91 8828166460");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateMobileNumber("+91 98765432109");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validatePassword("AkankshaJadhav@99");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validatePassword("AkankshaJadhav");
        Assert.assertTrue(actualOutput);
    }
}
