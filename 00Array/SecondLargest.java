
public class SecondLargest {
    public static int getSecondLargest(int[] arr){
        int n = arr.length;

        if(n < 2) return -1;
        
        int largest = -1, secondLargest = -1;
        for(int x : arr){
            if(x > largest){
                secondLargest = largest;
                largest = x;
            }
            else if(x < largest && x > secondLargest){
                secondLargest = x;
            }
        }
        return secondLargest;
        
    }
    public static void main(String[] args){
        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println("Output: " + getSecondLargest(arr));
    }
}
