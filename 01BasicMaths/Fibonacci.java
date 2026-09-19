import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n <= 1)
            System.out.println(n);

        int a = 0, b = 1;
        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
