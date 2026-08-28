import java.util.HashMap;
import java.util.Scanner;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        int ans = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {

            //Adds the newly encountered character at index r into the map (or updates its count).
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
            
            //Checks if the newly added character caused a duplicate inside the window. If its frequency is greater than 1, the window is invalid.
            while (freq.get(s.charAt(r)) > 1) {
                //Shrinks the window by removing the character at index l (decrementing its frequency) and advancing l rightward until the duplicate character's count drops back to 1.
                freq.put(s.charAt(l), freq.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }
            //Once the window is valid (no duplicates), update ans with the maximum length seen so far (r - l + 1 is the current window size).
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        // int result = lengthOfLongestSubstring("abcabcbb");
        // System.out.println(result);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // 2. Call the static method directly — NO 'new Solution()' needed!
        int result = lengthOfLongestSubstring(input);

        System.out.println("Length of longest substring: " + result);

        sc.close();
    }
}