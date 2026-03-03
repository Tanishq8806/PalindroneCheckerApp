class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListPalindrome {

    // Function to check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Step 1: Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: Compare halves
        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Convert string to linked list
    public static Node createList(String str) {
        Node head = null, tail = null;

        for (char ch : str.toCharArray()) {
            Node newNode = new Node(ch);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        String input = "radar";
        Node head = createList(input);
        System.out.println("Is Palindrome? " + isPalindrome(head));
    }
}