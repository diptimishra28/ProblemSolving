import java.util.Scanner;
import java.util.HashMap;

public class Anagram {
    public static boolean checkAnagram(String s, String t){
        if(s.length() != t.length()) 
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) 
                return false;

            map.put(c, map.get(c) - 1);

            if(map.get(c) == 0)
                map.remove(c);
        }
        return map.isEmpty(); //important
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String s = sc.nextLine();

        System.out.print("Enter string2: ");
        String t = sc.nextLine();

        boolean result =  checkAnagram(s, t);

        System.out.print(result);
    }
}