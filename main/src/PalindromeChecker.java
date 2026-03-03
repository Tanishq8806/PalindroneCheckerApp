public class PalindromeChecker {

    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end)
            return true;

        // If mismatch
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "level";
        System.out.println("Is Palindrome? " +
                isPalindrome(input, 0, input.length() - 1));
    }
}