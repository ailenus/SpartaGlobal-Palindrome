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

All three classes implement the abstract `PalindromeCheckable` interface.

### `PalindromeCheckable` interface

This is an abstract interface which does not inherit from any superinterface.
There is a single abstract method `isPalindrome`, defined as
`boolean isPalindrome(java.lang.String)`.

### `PalindromeChecker1` class

This class implements the `PalindromeCheckable` interface. It implements the
`isPalindrome` method using a simple loop.

The method checkes first if the first and last character of the string matches.
If not, it returns `false` immediately. Otherwise, it enters the next iteration
and checkes whether the second and the second to last character matches, and so
on. The loop stops when the index reaches half of the length of the string, at
which point the method returns `true`.

### `PalindromeChecker2` class

This class implements the `PalindromeCheckable` interface. It implements the
`isPalindrome` method by creating a new string that is the reverse of the given
string, and returns whether the new string matches the given string.

The method instantiates a new `java.lang.StringBuilder` object using the given
string, then invokes the `reverse` method to reverse it, and lastly returns a
new string using the `toString` method. It then returns whether this string
matches the given string by invoking the `equals` method of `java.lang.String`.

### `PalindromeChecker3` class

This class implements the `PalindromeCheckable` interface. It implements the
`isPalindrome` method by recursion.

The method first checkes if the string is empty or a single character, using
the `match` method of the `java.lang.String` class. The matching regular
expression is `[a-z]?`, which matches any single character between `a` (index
97) to `z` (index 122) that occurs never or once. If the string is empty or
a single character, it returns `true`. This is the base case of the recusion.

If the string is longer than one character, it first compares whether the first
and the last characters thereof match. If not, it returns `false` immediately.
Otherwise, it invokes itself on the substring of the given string that has both
the first and the last characters sliced.

### Program execution

The main class is `App`, which contains the `main` method and throws
`java.io.IOException`. The exception comes from the use of
`java.io.BufferedReader`.

The program first prompts the user to input a text paragraph via the standard
input, ending with a new line. Then a `java.io.BufferedReader` is instantiated
with a new `java.io.InputStreamReader`, which takes the standard input object
`java.lang.System.in`. The buffered reader then reads the user input and stores
into a named string.

A new *`java.util.List`* of type `java.lang.String` is then created, which
stores the paragraph processed into an array of lowercase words that consist
solely of the twenty-six letters of the alphabet; this array is converted into
a fixed-size list using the `java.util.Arrays.asList` method.

The program then prompts the user to enter either 1, 2, or 3 for each of the
three methods of checking palindromes. A perpetual loop is used to ensure that
the user enters only one of these three options.

A new `java.util.ArrayList` is then created and used to store the confirmed
palindromes. An `if`–`else` block is used for each of the three options. In
each conditional branch, a new `PalindromeCheckable` object is declared and
instantiated according to the option chosen by the user. A loop that iterates
over the list of words is then used to check each of the word in the list, and
whenever a word is checked to be a palindrome, it is added to the list of
palindromes.

Lastly, if the list of palindromes is empty, the program prints to the standard
output informing the user so. Otherwise, the program prints each of the words
stored in the list of palindromes to the standard output using a loop.