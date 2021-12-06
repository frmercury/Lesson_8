import java.util.Scanner;

public class Reverse {

    public String getString() {
        String str = null;
        System.out.println("Please enter a string to reverse: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String input = scanner.nextLine();
            System.out.printf("Please enter a string: ", input);
        }
        str = scanner.nextLine();
        return str;
    }

//    public char[] getScanner () {
//        System.out.println("Input string: ");
//        Scanner scanner = new Scanner(System.in);
//        char[] charArr = scanner.next().toCharArray();
//        return charArr;
//    }

    public void getReverseString (String str) {
        char[] charArr = str.toCharArray();
        String reverseString = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            reverseString += charArr[i];
        }
        System.out.println("\nReversed string: " + reverseString +"\n");
    }
}
