package com.spartaglobal;

public class PalindromeChecker1 implements PalindromeCheckable {
    @Override
    public boolean isPalindrome(String string) {
        int indexFirst = 0;
        int indexLast = string.length() - 1;
        while (indexFirst < indexLast) {
            if (string.charAt(indexFirst) != string.charAt(indexLast)) {
                return false;
            }
            indexFirst++;
            indexLast--;
        }
        return true;
    }
}
