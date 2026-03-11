import java.util.*;

public class UC13 {

    // Method 1: Stack Approach
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 2: Deque Approach
    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Two Pointer (Array)
    public static boolean arrayPalindrome(String input) {

        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String input = sc.nextLine();

        // Stack Timing
        long start1 = System.nanoTime();
        boolean r1 = stackPalindrome(input);
        long end1 = System.nanoTime();

        // Deque Timing
        long start2 = System.nanoTime();
        boolean r2 = dequePalindrome(input);
        long end2 = System.nanoTime();

        // Array Timing
        long start3 = System.nanoTime();
        boolean r3 = arrayPalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nInput: " + input);

        System.out.println("\nStack Method: " + r1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Method: " + r2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nArray Method: " + r3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}