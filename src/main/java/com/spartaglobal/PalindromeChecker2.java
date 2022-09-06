package com.spartaglobal;

public class PalindromeChecker2 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        String processedString = string.replaceAll("\\s+",
                "").toLowerCase();
        String reverseProcessedString
                = new StringBuilder(processedString).reverse().toString();
        return processedString.equals(reverseProcessedString);
    }
}
