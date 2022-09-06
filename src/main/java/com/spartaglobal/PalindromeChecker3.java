package com.spartaglobal;

public class PalindromeChecker3 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        if (string.matches("[a-z]?")) {
            return true;
        } else {
            int stringLength = string.length();
            if (string.charAt(0) != string.charAt(stringLength - 1)) {
                return false;
            } else {
                return isPalindrome(string.substring(1, stringLength - 1));
            }
        }
    }
}