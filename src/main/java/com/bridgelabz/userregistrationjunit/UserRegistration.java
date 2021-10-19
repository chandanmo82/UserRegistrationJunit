package com.bridgelabz.userregistrationjunit;

public class UserRegistration {
    static String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public static boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }

}

