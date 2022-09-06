package com.spartaglobal;

public class PalindromeChecker2 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        String reverseProcessedString
                = new StringBuilder(string).reverse().toString();
        return string.equals(reverseProcessedString);
    }
}
