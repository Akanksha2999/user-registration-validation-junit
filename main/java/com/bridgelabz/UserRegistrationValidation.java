package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,15}", firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{3,15}", lastName);
    }

    public boolean validateEmailId(String emailId) {
        return Pattern.matches("[a-z][a-z A-Z 0-9]+[@][a-z]+[.][a-z]{2,5}", emailId);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches("[+]91 [6789][0-9]{9}", mobileNumber);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z 0-9 $&+,:;=?@#|'<>.-^*()%!]{8,}", password);
    }
}
