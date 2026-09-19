// Node class: Linked List ke ek single box/node ka structure
class Node {
    int data;   // Node me data/value store karne ke liye
    Node next;  // Agle node ka memory address (pointer) store karne ke liye

    // Constructor: Jab bhi naya Node banega, tab ye call hoga
    Node(int data1) {
        this.data = data1; // Jo value paas karenge wo 'data' me set ho jayegi
        this.next = null;  // Shuru me next pointer empty (null) rahega
    }
}

public class ConvertArrayToLL {

    // Method 1: Array ko Linked List me convert karne ke liye
    private static Node convertArr2LL(int[] arr) {
        // Agar array khali hai toh null return kar do
        if (arr.length == 0) return null;

        // 1. Array ke pehle element (arr[0]) se Head Node banao
        Node head = new Node(arr[0]);

        // 2. Head ka reference 'mover' pointer me rakho
        Node mover = head;

        // 3. Array ke 2nd element (index 1) se end tak loop chalao
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]); // Naya node banao
            mover.next = temp;            // Purane node ke 'next' me naye node ka address jodo
            mover = temp;                 // 'mover' pointer ko naye node par aage badha do
        }

        // Complete Linked List ka starting point (head) return 
        return head;
    }

    // Method 2: Poori Linked List ko print karne ke liye
    private static void printList(Node head) {
        Node temp = head; // Head se start karenge

        // Jab tak temp null nahi ho jata (matlab end tak na pahunch jaye)
        while (temp != null) {
            System.out.print(temp.data + " -> "); // Current node ka data print karo
            temp = temp.next;                     // Agle node par move karo
        }

        // Last me end/null print karo
        System.out.println("null");
    }

    // Method 3: Linked List ki Length (Total Nodes) count karne ke liye
    private static int lengthList(Node head) {
        int count = 0;
        Node temp = head;

        // Jab tak temp null nahi ho jata, count badhate jao
        while (temp != null) {
            count++;
            temp = temp.next; // Agle node par move karo
        }

        return count; // Total nodes ka count return karo
    }

    // Method 4: Linked List me Element Search karne ke liye
    private static boolean checkIfPresent(Node head, int val) {
        Node temp = head;

        // Jab tak list khatam nahi ho jaati traverse karo
        while (temp != null) {
            // Agar target value mil gayi
            if (temp.data == val) {
                return true;
            }
            temp = temp.next; // Agle node par move karo
        }

        // Agar poori list check karne ke baad bhi nahi mila
        return false;
    }

    // Main Method: Execution yahan se shuru hota hai
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8}; // Array initialize kiya

        // Array ko Linked List me convert kiya aur 'head' store kar liya
        Node head = convertArr2LL(arr);

        // Option A: Sirf Head node ka data print karne ke liye 
        // System.out.println(head.data); // Output: 12

        // Option B: Poori Linked List '12 -> 5 -> 6 -> 8 -> null' print karne ke liye
        System.out.print("Linked List: ");
        printList(head);

        // Linked List ki Length print karo
        int len = lengthList(head);
        System.out.println("Length of Linked List: " + len);

        // Search Operation Test
        int target1 = 6;
        int target2 = 15;

        System.out.println("Is " + target1 + " present? " + checkIfPresent(head, target1));
        System.out.println("Is " + target2 + " present? " + checkIfPresent(head, target2));
    }
}