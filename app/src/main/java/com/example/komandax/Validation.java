package com.example.komandax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static final String REGEX_USERNAME_PATTERN = "^[a-zA-Z]{3,20}$";
    public static boolean isValidUsername(String username){
        Pattern pattern = Pattern.compile(REGEX_USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);

        return matcher.find();
    }

    public static final String REGEX_PASSWORD_PATTERN = "^[a-zA-Z]{5,20}$";
    public static boolean isValidPassword(String password){
        Pattern pattern = Pattern.compile(REGEX_PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }

    public static final String REGEX_MAIL_PATTERN = "^[a-zA-Z]{5,20}$";
    public static boolean isValidMail(String mail){
        Pattern pattern = Pattern.compile(REGEX_MAIL_PATTERN);
        Matcher matcher = pattern.matcher(mail);

        return matcher.find();
    }

}