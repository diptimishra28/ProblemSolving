//import java.util.*; // List, ArrayList, HashMap, Scanner all
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    
    // Function to find duplicate elements using HashMap
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) == 2) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Read the array elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function
        List<Integer> duplicates = findDuplicates(nums);

        // Display the result
        System.out.println("Duplicate numbers are: " + duplicates);

        sc.close();
    }
}