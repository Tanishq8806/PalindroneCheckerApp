import java.util.*;

public class QueueStackPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Enqueue and Push characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare Dequeue and Pop
        for (int i = 0; i < str.length(); i++) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}