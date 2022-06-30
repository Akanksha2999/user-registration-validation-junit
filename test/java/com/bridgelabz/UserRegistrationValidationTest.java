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
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateLastNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateLastName("Jadhav");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateLastName("jadhav");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateEmailId("akankshajadhav2999@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailIdForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateEmailId("akankshajadhav2999gmail.com");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateMobileNumberForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateMobileNumber("+91 8828166460");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validateMobileNumber("+91 98765432109");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validatePasswordForPositiveScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validatePassword("AkankshaJadhav@99");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordForNegativeScenarioTest() {
        boolean actualOutput = userRegistrationValidation.validatePassword("AkankshaJadhav");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateMultipleEmailIdForPositiveScenarioTest() {
        boolean actualOutput1 = userRegistrationValidation.validateMultipleEmailId("abc@yahoo.com");
        Assert.assertTrue(actualOutput1);
        boolean actualOutput2 = userRegistrationValidation.validateMultipleEmailId("abc-100@yahoo.com");
        Assert.assertTrue(actualOutput2);
        boolean actualOutput3 = userRegistrationValidation.validateMultipleEmailId("abc.100@yahoo.com");
        Assert.assertTrue(actualOutput3);
        boolean actualOutput4 = userRegistrationValidation.validateMultipleEmailId("abc111@abc.com");
        Assert.assertTrue(actualOutput4);
        boolean actualOutput5 = userRegistrationValidation.validateMultipleEmailId("abc-100@abc.net");
        Assert.assertTrue(actualOutput5);
        boolean actualOutput7 = userRegistrationValidation.validateMultipleEmailId("abc@1.com");
        Assert.assertTrue(actualOutput7);
        boolean actualOutput8 = userRegistrationValidation.validateMultipleEmailId("abc+100@gmail.com");
        Assert.assertTrue(actualOutput8);

    }

    @Test
    public void validateMultipleEmailIdForNegativeScenarioTest() {
        boolean actualOutput1 = userRegistrationValidation.validateMultipleEmailId("abc");
        Assert.assertFalse(actualOutput1);
        boolean actualOutput2 = userRegistrationValidation.validateMultipleEmailId("abc@.com.my");
        Assert.assertFalse(actualOutput2);
        boolean actualOutput3 = userRegistrationValidation.validateMultipleEmailId("abc123@gmail.a");
        Assert.assertFalse(actualOutput3);
        boolean actualOutput4 = userRegistrationValidation.validateMultipleEmailId("abc123@.com");
        Assert.assertFalse(actualOutput4);
        boolean actualOutput5 = userRegistrationValidation.validateMultipleEmailId("abc123@.com.com");
        Assert.assertFalse(actualOutput5);
        boolean actualOutput6 = userRegistrationValidation.validateMultipleEmailId(".abc@abc.com");
        Assert.assertFalse(actualOutput6);
        boolean actualOutput7 = userRegistrationValidation.validateMultipleEmailId("abc()*@gmail.com");
        Assert.assertFalse(actualOutput7);
        boolean actualOutput8 = userRegistrationValidation.validateMultipleEmailId("abc@%*.com");
        Assert.assertFalse(actualOutput8);
        boolean actualOutput9 = userRegistrationValidation.validateMultipleEmailId("abc..2002@gmail.com –");
        Assert.assertFalse(actualOutput9);
        boolean actualOutput11 = userRegistrationValidation.validateMultipleEmailId("abc@abc@gmail.com");
        Assert.assertFalse(actualOutput11);
        boolean actualOutput12 = userRegistrationValidation.validateMultipleEmailId("abc@gmail.com.1a");
        Assert.assertFalse(actualOutput12);
        boolean actualOutput13 = userRegistrationValidation.validateMultipleEmailId("abc@gmail.com.aa.au -");
        Assert.assertFalse(actualOutput13);
    }
}
