public class LargestSmallEle {
    public static void main(String[] args){
        int[] arr = {7, 2, 4, 9, 12, 1, 3};

        int max = arr[0], min = arr[0];
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
