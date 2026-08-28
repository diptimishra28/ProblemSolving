import java.util.Scanner;
import java.util.HashMap;

public class UniqueChar {
    public static int firstUniqueChar(String s){
        // Step 1: Create a HashMap to count character occurrences
        HashMap<Character, Integer> map = new HashMap<>();

        // Count how many times each character appears in s
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Step 2: Loop through the original string in order
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            // Check if this character's total count is exactly 1
            if(map.get(currentChar) == 1)
                return i; // Found the first unique character index!
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        int result = firstUniqueChar(input);
        System.out.println("First unique element at index: " + result);

        sc.close();
    }
}
