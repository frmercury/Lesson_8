import java.util.Scanner;

public class EvenNumber {

//    public static int getInput() {
//        System.out.println("Input number: ");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextInt();
//    }

    public int getInt () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number.%n", input);
            System.out.print("Please enter correct number: ");
        }
        return scanner.nextInt();
    }

    public void oddEven (int number){
        if(number %2!=0) {
            System.out.println("\nEntered value is an odd number. \n");
        } else {
            System.out.println("\nEntered value is an even number. \n");
        }
    }
}
