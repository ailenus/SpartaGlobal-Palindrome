package com.spartaglobal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final String PALINDROME = "redividerredividerredivider";
    private static final String NOT_PALINDROME = "zixuoperwwcrqwrwnznpzyqhyka";
    /**
     * 1st true
     */
    @Test
    public void testTrue1() {
        assertTrue((new PalindromeChecker1()).isPalindrome(PALINDROME));
    }

    /**
     * 1st false
     */
    @Test
    public void testFalse1() {
        assertTrue(!(new PalindromeChecker1()).isPalindrome(NOT_PALINDROME));
    }

    /**
     * 2nd true
     */
    @Test
    public void testTrue2() {
        assertTrue((new PalindromeChecker2()).isPalindrome(PALINDROME));
    }

    /**
     * 2nd false
     */
    @Test
    public void testFalse2() {
        assertTrue(!(new PalindromeChecker2()).isPalindrome(NOT_PALINDROME));
    }

    /**
     * 3rd true
     */
    @Test
    public void testTrue3() {
        assertTrue((new PalindromeChecker3()).isPalindrome(PALINDROME));
    }

    /**
     * 3rd false
     */
    @Test
    public void testFalse3() {
        assertTrue(!(new PalindromeChecker3()).isPalindrome(NOT_PALINDROME));
    }
}
