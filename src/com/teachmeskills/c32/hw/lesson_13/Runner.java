package com.teachmeskills.c32.hw.lesson_13;

import com.teachmeskills.c32.hw.lesson_13.auth.Auth;
import com.teachmeskills.c32.hw.lesson_13.exceptions.WrongLoginException;
import com.teachmeskills.c32.hw.lesson_13.exceptions.WrongPasswordException;
import com.teachmeskills.c32.hw.lesson_13.validation.CharArrayValidator;
import com.teachmeskills.c32.hw.lesson_13.validation.StringValidator;

public class Runner {
    public static void main(String[] args) {

        Auth[] users = {
                new Auth("Alice", "Pass1234", "Pass1234"),
                new Auth("Bob", "Red", "Red"),
                new Auth("Make", "password", "password"),
                new Auth("David", "Pass", "Pass"),
                new Auth("Eve_123", "1234abc", "abc1234"),
        };

        for (Auth user : users) {
            testWithStringValidator(user);
            testWithCharArrayValidator(user);
        }
    }

    // Method for checking with StringValidator
    private static void testWithStringValidator(Auth user) {
        try {
            StringValidator.validate(user.getLogin(), user.getPassword(), user.getConfirmPassword());
            System.out.println("StringValidator: Validation passed for " + user.getLogin());
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("StringValidator: " + e.getMessage());
        }
    }

    // Method for checking with CharArrayValidator
    private static void testWithCharArrayValidator(Auth user) {
        try {
            CharArrayValidator.validate(user.getLogin(), user.getPassword(), user.getConfirmPassword());
            System.out.println("CharArrayValidator: Validation passed for " + user.getLogin());
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("CharArrayValidator: " + e.getMessage());
        }
    }
}
