package com.spartaglobal;

public class PalindromeChecker3 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        String processedString = string.replaceAll("\\s+",
                "").toLowerCase();
        return isPalindromeHelper(processedString);
    }

    private boolean isPalindromeHelper(String string) {
        if (string.matches(".?")) {
            return true;
        } else {
            int stringLength = string.length();
            if (string.charAt(0) != string.charAt(stringLength - 1)) {
                return false;
            } else {
                return isPalindromeHelper(string.substring(1,
                        stringLength - 1));
            }
        }
    }
}
