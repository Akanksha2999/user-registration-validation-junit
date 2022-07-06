package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface IUserRegistrationValidationFunction {
    boolean validate(String input) throws UserRegistrationValidationException;
}

public class UserRegistrationValidation {
    IUserRegistrationValidationFunction validateFirstName = firstName -> {
        // Created regex pattern for firstname
        if (Pattern.matches("[A-Z][a-z A-Z]{3,15}", firstName)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid first name");
        }
    };

    IUserRegistrationValidationFunction validateLastName = lastName -> {
        // Created regex pattern for lastname
        if (Pattern.matches("[A-Z][a-z A-Z]{3,15}", lastName)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid last name");
        }
    };

    IUserRegistrationValidationFunction validateEmailId = emailId -> {
        // Created regex pattern for email
        if (Pattern.matches("[a-z][a-z A-Z 0-9_!#$%&'*+/=?`{|}~^.-]+[@][a-z]+[.][a-z]{2,5}+[.][a-z]{2,3}", emailId)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid email id");
        }
    };

    IUserRegistrationValidationFunction validateMobileNumber = mobileNumber -> {
        // Created regex pattern for mobile number
        if (Pattern.matches("[+]91 [6789][0-9]{9}", mobileNumber)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid mobile number");
        }
    };

    IUserRegistrationValidationFunction validatePassword = password -> {
        // Created regex pattern for password
        if (Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid password");
        }
    };
}