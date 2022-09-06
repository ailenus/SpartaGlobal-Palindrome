package com.spartaglobal;

public class PalindromeChecker2 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        String processedString = string.replaceAll("\\s+",
                "").toLowerCase();
        int stringLength = processedString.length();
        for (int index = 0; index < stringLength / 2; index++) {
            if (processedString.charAt(index)
                    != processedString.charAt(stringLength - index - 1)) {
                return false;
            }
        }
        return true;
    }
}
