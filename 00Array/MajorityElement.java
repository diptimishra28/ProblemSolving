import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] arr){
        int candidate = 0;
        int count = 0;

        //Step 1: Voting Algorithm to find the majority candidate
        for(int x : arr){
            if(count == 0) {
                candidate = x; // Naya candidate chuno
            }
            if(x == candidate)
                count++;  // Same candidate = support
            else
                count--;  // Different candidate = vote cancel
        }
        return candidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = majorityElement(arr);
        System.out.println("\nMajority Element: " + ans);

        sc.close();
    }
}
