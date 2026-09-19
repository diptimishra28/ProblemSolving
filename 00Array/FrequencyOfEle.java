import java.util.*;

public class FrequencyOfEle {
    public static ArrayList<ArrayList<Integer>> frequencyCount(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create 2D ArrayList to store [element, frequency] pairs
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Step 3: Populate 2D ArrayList from HashMap entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());    // Element
            pair.add(entry.getValue());  // Frequency

            result.add(pair);            // Add pair to main result list
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> frequencyList = frequencyCount(arr);
        System.out.println(frequencyList);
    }
}




/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Function to calculate frequency and return dynamic 2D ArrayList
    public static ArrayList<ArrayList<Integer>> frequencyCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create 2D ArrayList to store [element, frequency] pairs
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Step 3: Populate 2D ArrayList from HashMap entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());    // Element
            pair.add(entry.getValue());  // Frequency

            result.add(pair);            // Add pair to main result list
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take total number of elements as input
        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Read array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Call function and get 2D result
        ArrayList<ArrayList<Integer>> frequencyList = frequencyCount(arr);

        // Step 4: Display final formatted output
        System.out.println("\nOutput:");
        System.out.println(frequencyList);

        sc.close();
    }
}
*/