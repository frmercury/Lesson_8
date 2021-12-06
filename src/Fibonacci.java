import java.util.Scanner;

public class Fibonacci {


    public long getInt () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number.%n", input);
            System.out.print("Please enter correct number: ");
        }
        return scanner.nextInt();
    }

    public void fib(long n) {
        long count = n, num1 = 0, num2 = 1;
        System.out.print("\nFibonacci Series of "+count+" numbers: ");

        long i=1;
        while(i<=count) {
            System.out.print(num1+" ");
            long sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        System.out.println("\n");
    }
}
