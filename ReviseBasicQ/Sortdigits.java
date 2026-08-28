/**
Input:
[2, 0, 2, 1, 1, 0]

Output:
[0, 0, 1, 1, 2, 2] 
*/
import java.util.Arrays;

public class Sortdigits {
    public static void main(String[] args){
        int [] arr = {2, 0, 1, 2, 0 , 0 , 1 , 1};
        int n = arr.length;
        int zero = 0, one = 0, two = 0;

        for(int x : arr){
            if(x == 0)zero++;
            else if(x == 1) one++;
            else if(x == 2) two++;
        }

        int index = 0;
        while(zero-- > 0){
            arr[index++] = 0;
        }
        while(one-- > 0){
            arr[index++] = 1;
        }
        while(two-- > 0){
            arr[index++] = 2;
        }

        System.out.print(Arrays.toString(arr));
    }
}
