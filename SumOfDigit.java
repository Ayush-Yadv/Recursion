import java.util.*;

public class SumOfDigit {
    public static int sumOfDigit(int n) {
        int result = 0;
        if (n == 0) {
            return 0;
        } else {
            result = n % 10 + sumOfDigit(n / 10);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to find the sum of digits: ");
        int n = sc.nextInt();
        int answer = sumOfDigit(n);
        System.out.println("Result: " + answer);
    }
}