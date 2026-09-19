import java.util.Arrays;

public class ReverseAnArray {
    public static void reversedAnArray(int[] arr){

        int l = 0, r = arr.length - 1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        } 
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 2, 3, 10};

        reversedAnArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
