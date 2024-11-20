package com.teachmeskills.c32.hw.lesson_13.validation;

import com.teachmeskills.c32.hw.lesson_13.exceptions.WrongLoginException;
import com.teachmeskills.c32.hw.lesson_13.exceptions.WrongPasswordException;

public class StringValidator {

    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and contain no spaces.");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password must be less than 20 characters, contain no spaces, and include at least one digit.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match.");
        }
    }
}
