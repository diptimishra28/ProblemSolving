import java.util.Scanner;

public class MaxSumSubArray {
// Kadane's Algorithm - O(N) Time, O(1) Space
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;

            // Update maximum sum seen so far
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // Reset current sum if it becomes negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);
        System.out.println("\nMaximum Subarray Sum is: " + result);

        sc.close();
    }
}






/*

// OUTPUT- 
// Enter total number of elements: 9
// Enter 9 elements:
// -2 1 -3 4 -1 2 1 -5 4

// --- Result ---
// Maximum Subarray Sum: 6
// Maximum Subarray Elements: [ 4 -1 2 1 ]
// Start Index: 3, End Index: 6



import java.util.Scanner;

public class MaxSumSubArray {

    public static void printMaxSubarray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            // Step 1: Naye subarray ki shuruaat mark karein
            if (sum == 0) {
                start = i;
            }

            // Step 2: Sum me current element add karein
            sum = sum + arr[i];

            // Step 3: Agar naya max sum mil gaya, toh indices update karein
            if (sum > maxi) {
                maxi = sum;
                ansStart = start; // Blue Box logic
                ansEnd = i;
            }

            // Step 4: Negative sum ko reset karein
            if (sum < 0) {
                sum = 0;
            }
        }

        // Output Print
        System.out.println("\n--- Result ---");
        System.out.println("Maximum Subarray Sum: " + maxi);
        System.out.print("Maximum Subarray Elements: [ ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println("Start Index: " + ansStart + ", End Index: " + ansEnd);
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

        printMaxSubarray(arr);

        sc.close();
    }
}
*/