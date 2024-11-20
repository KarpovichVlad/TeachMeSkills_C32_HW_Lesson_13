package com.teachmeskills.c32.hw.lesson_13.validation;

import com.teachmeskills.c32.hw.lesson_13.exceptions.WrongLoginException;
import com.teachmeskills.c32.hw.lesson_13.exceptions.WrongPasswordException;

public class CharArrayValidator {

    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || containsChar(login.toCharArray(), ' ')) {
            throw new WrongLoginException("Login must be less than 20 characters and contain no spaces.");
        }

        if (password.length() >= 20 || containsChar(password.toCharArray(), ' ') || !containsDigit(password.toCharArray())) {
            throw new WrongPasswordException("Password must be less than 20 characters, contain no spaces, and include at least one digit.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match.");
        }
    }

    private static boolean containsChar(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(char[] array) {
        for (char c : array) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
