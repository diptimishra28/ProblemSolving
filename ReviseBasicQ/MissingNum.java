import java.util.Scanner;

public class MissingNum {
    public static int missingNumber(int[]arr, int n){
        int m = n + 1; //calculate the sum up to n + 1 instead of just n.
        int expected = m * (m + 1) / 2;
        int actual = 0;

        for(int x : arr){
            actual += x;
        }

        return expected - actual;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(missingNumber(arr,n));
    }
}
