import java.util.Scanner;

public class PrimeNum {
    public static boolean checkPrime(int n){
        if(n < 2) return false;

        int count = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0) count++;
        }
        if(count > 1) return false;
        else return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(checkPrime(n));
        sc.close();
    }

}
