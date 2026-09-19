import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    public static void moveZeroes(int[] arr){
        int size = arr.length;

        //add non-zero element in the starting
        int temp = 0;
        for(int x: arr){
            if(x != 0){
                arr[temp] = x;
                temp++;
            }
        }
        //add all to the end
        while(temp < size){
            arr[temp] = 0;
            temp++;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);
        System.out.print(Arrays.toString(arr));

        sc.close();
    }
}
