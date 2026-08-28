import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();
        int l = 0, r = arr.length - 1;
        boolean isPalindrome = true;

        while(l < r){
            if(arr[l] != arr[r]) 
                isPalindrome = false;
            l++; r--;
        }
        if(isPalindrome){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
