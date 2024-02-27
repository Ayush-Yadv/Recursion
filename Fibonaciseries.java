import java.util.Scanner;

public class Fibonaciseries {
    public static int fibonaci(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            return n;
        } else {
            result = fibonaci(n - 1) + fibonaci(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which want to find ");
        int n = sc.nextInt();
        int Answer = fibonaci(n);
        System.out.println("result:" + " " + Answer);
    }
}
