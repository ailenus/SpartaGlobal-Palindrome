package com.spartaglobal;

public class PalindromeChecker3 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        String processedString = string.replaceAll("\\s+",
                "").toLowerCase();
        return isPalindromeHelper(processedString);
    }

    private boolean isPalindromeHelper(String string) {
        return isPalindromeHelper(string.substring(1, string.length() - 1));
    }
}
