import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while(temp != 0){
            temp = temp / 10;
            count++;
        }

        temp = n;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp/10;
        }
        System.out.println("Armstrong: " + sum);
    }
}
