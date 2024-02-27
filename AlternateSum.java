
import java.util.Scanner;

public class AlternateSum {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sign = (n % 2 == 0) ? -1 : 1;
            return sign * n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to find the alternate sum: ");
        int n = sc.nextInt();
        int answer = sum(n);
        System.out.println("Result: " + answer);
    }
}
