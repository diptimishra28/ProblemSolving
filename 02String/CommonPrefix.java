import java.util.Scanner;

public class CommonPrefix{
    public static String longestCommonPrefix(String[] words){
        if(words.length == 0 || words == null)
            return "";

        for(int i = 0; i < words[0].length(); i++){
            char firstWordChar = words[0].charAt(i);

            for(int j = 1; j < words.length; j++){
                if(i == words[j].length() || words[j].charAt(i) != firstWordChar){
                    return words[0].substring(0, i);
                }
            }
        }
        return words[0];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();

        String [] words = new String[n];
        System.out.print("\n" + "Enter " + n + " words one by one : ");
        for(int i = 0; i < n; i++){
            System.out.print("word " + (i + 1) + ": ");
            words[i] = sc.next();
        }

        String result = longestCommonPrefix(words);
        System.out.print("Longest common prefix: " + result);
        sc.close();
    }
}