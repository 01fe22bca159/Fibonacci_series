import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth Fibonacci number: ");
        int n = scanner.nextInt();

        // Handle the case where n is less than 0
        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        long fibNumber = findNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);
    }

    public static long findNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibfirst= 0;
        int fibsecond = 1;

        for (int i = 2; i <= n; i++) {
            int fiblast = fibfirst + fibsecond;
            fibfirst = fibsecond;
            fibsecond = fiblast;
        }

        return fibsecond;
    }
}
