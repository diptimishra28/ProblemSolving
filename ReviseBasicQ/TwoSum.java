import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            
            int check = target - nums[i];

           if(map.containsKey(check))
           {
                int[] ans = {i, map.get(check)};
                return ans;
           }
           map.put(nums[i], i);

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        //System.out.println(twoSum(nums));
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}