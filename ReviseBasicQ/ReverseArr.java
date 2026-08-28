import java.util.Scanner;
import java.util.Arrays;

public class ReverseArr {
    // public static void main(String[] args){
    //     int [] arr = {1, 2, 3, 4, 5};
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){
    //         System.out.print(arr[n - 1 - i]);
    //     }
    // }
    public static void reverse(int []arr, int n){
        int left = 0, right = n - 1; 
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        //Arrays.toString(numbers) not understand
        System.out.println(Arrays.toString(arr));
    }
}
