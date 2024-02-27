import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            result = 1;

        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which want to find ");
        int n = sc.nextInt();
        int Answer = factorial(n);
        System.out.println("result:" + " " + Answer);
    }
}