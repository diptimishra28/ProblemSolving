import java.util.HashSet;
public class DuplicateNum {
    
    public static int duplicateNumber(int []arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            if(set.contains(x)) return x;
            set.add(x);
        }
        return -1;
    }
    public static void main(String[] args){
        int []arr = {1, 2, 3, 6, 6, 7,8};
        System.out.println(duplicateNumber(arr));
    }
}
