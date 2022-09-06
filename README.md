# Palindrome

Task for Engineering 149 at Sparta Global.

## Summary

This is a command-line application that allows a user to use any of the three
different methods for checking palindromes.

The user is prompted to enter a text paragraph via the standard input. Then the
user is asked to choose among the three different methods of checking
palindromes. The list of palindromes is then printed to the standard output.

## Details

The first class, `PalindromeChecker1`, uses a simple loop.

The second class, `PalindromeChecker2`, uses `java.lang.StringBuilder` to
reverse the string and then compare it to the original string.

The third class, `PalindromeChecker3`, uses recursion.

All three classes implement the `PalindromeCheckable` interface, which contains
an abstract method `isPalindrome`.