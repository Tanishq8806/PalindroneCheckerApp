public class PalindromeChecker {

    public static boolean isPalindrome(String str) {

        // Step 1: Normalize string
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = str.length() - 1;

        // Step 2: Compare using two pointers
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        System.out.println("Is Palindrome? " + isPalindrome(input));
    }
}