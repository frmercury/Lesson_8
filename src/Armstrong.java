import java.util.Scanner;

public class Armstrong {

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

    public void armstr (long num) {
        int n, digit, digits, power, sum=0;
        String s = String.valueOf(num);
        digits = s.length();
        power = digits;

        n = (int) num;

        while (n != 0)
        {
            digit = n % 10;
            sum = sum + (int)Math.pow(digit,power);
            n = n / 10;
        }

        if (num == sum)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num+ " is not an Armstrong Number");
    }
}