package com.bridgelabz.userregistrationjunit;

public class UserRegistration {
    static String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    static  String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";

    public static boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public static boolean validateEmailId(String emailId) {
        return emailId.matches(EMAIL_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }

}

