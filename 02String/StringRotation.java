import java.util.Scanner;

public class StringRotation {

    // Optimal Trick Solution - O(N) Time, O(N) Space
    public static boolean rotateString(String s, String goal) {
        // Base Condition: Lengths must be equal
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself
        String doubleS = s + s;

        // Check if goal is a substring of doubleS
        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.next();

        System.out.print("Enter string goal: ");
        String goal = sc.next();

        boolean result = rotateString(s, goal);

        System.out.println("\nIs goal a valid rotation of s? " + result);

        sc.close();
    }
}