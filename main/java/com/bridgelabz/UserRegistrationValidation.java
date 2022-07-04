package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    public boolean validateFirstName(String firstName) throws UserRegistrationValidationException {
        if (Pattern.matches("[A-Z][a-z]{3,15}", firstName)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid first name");
        }
    }

    public boolean validateLastName(String lastName) throws UserRegistrationValidationException {
        if (Pattern.matches("[A-Z][a-z]{3,15}", lastName)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid last name");
        }
    }

    public boolean validateEmailId(String emailId) throws UserRegistrationValidationException {
        if (Pattern.matches("[a-z][a-z A-Z 0-9]+[@][a-z]+[.][a-z]{2,5}", emailId)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid email id");
        }
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationValidationException {
        if (Pattern.matches("[+]91 [6789][0-9]{9}", mobileNumber)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid mobile number");
        }
    }

    public boolean validatePassword(String password) throws UserRegistrationValidationException {
        if (Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z 0-9 $&+,:;=?@#|'<>.-^*()%!]{8,}", password)) {
            return true;
        } else {
            throw new UserRegistrationValidationException("Entered invalid password");
        }
    }
}
