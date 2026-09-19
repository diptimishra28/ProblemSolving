import java.util.Scanner;

public class Factorial {
    public static int factorialNum(int n){
            
        if(n == 0 && n == 1) return 1;
        if(n == 2) return 2;

        return n * factorialNum(n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(factorialNum(n));
    }
}
