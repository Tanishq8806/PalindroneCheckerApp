public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPalindrome(word));
    }
}