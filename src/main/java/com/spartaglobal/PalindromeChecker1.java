package com.spartaglobal;

public class PalindromeChecker1 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        int stringLength = string.length();
        for (int index = 0; index < stringLength / 2; index++) {
            if (string.charAt(index)
                    != string.charAt(stringLength - index - 1)) {
                return false;
            }
        }
        return true;
    }
}
