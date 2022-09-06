package com.spartaglobal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Palindrome app.");
        System.out.print("Enter a text paragraph: ");

        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));
        String paragraph = bufferedReader.readLine();
        List<String> words = Arrays.asList(paragraph.replaceAll(
                "[^a-zA-Z ]", "").toLowerCase().split(
                "\\s+"));

        System.out.println("Which checking method would you like to use?\n"
                + "Enter 1 for a loop, 2 for string reversal, and 3 for "
                + "recursion.");
        int choice = 0;
        while (true) {
            System.out.print("Choice: ");
            try {
                choice = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter 1, 2, or 3.");
                continue;
            }
            if (choice < 1 || choice > 3) {
                System.out.println("Please enter 1, 2, or 3.");
                continue;
            }
            break;
        }

        List<String> palindromes = new ArrayList<>();
        if (choice == 1) {
            PalindromeCheckable palindromeChecker = new PalindromeChecker1();
            for (String word : words) {
                if (palindromeChecker.isPalindrome(word)) {
                    palindromes.add(word);
                }
            }
        } else if (choice == 2) {
            PalindromeCheckable palindromeChecker = new PalindromeChecker2();
            for (String word : words) {
                if (palindromeChecker.isPalindrome(word)) {
                    palindromes.add(word);
                }
            }
        } else if (choice == 3) {
            PalindromeCheckable palindromeChecker = new PalindromeChecker3();
            for (String word : words) {
                if (palindromeChecker.isPalindrome(word)) {
                    palindromes.add(word);
                }
            }
        }
        if (palindromes.size() == 0) {
            System.out.println("There are no palindromes in your paragraph.");
        } else {
            System.out.println("The palindromes in your paragraph are:");
            for (String palindrome : palindromes) {
                System.out.println(palindrome);
            }
        }
    }
}
