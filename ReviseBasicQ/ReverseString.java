import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input){
        char[] arr = input.toCharArray();
        int l = 0, r = arr.length - 1;
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr); //important
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        String result = reverse(input);

        System.out.println("reversed String: " + result);

        sc.close();
    }
}
