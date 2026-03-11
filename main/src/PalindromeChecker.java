import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

