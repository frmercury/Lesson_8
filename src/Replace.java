import java.util.Scanner;

public class Replace {

    public String getString() {
        String str = null;
        System.out.println("Please enter a string <30 symbols to replace: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
                String input = scanner.nextLine();
                System.out.printf("Please enter a string: ", input);
            }
        str = scanner.nextLine();
        return str;
    }

    public void replaceSymbols(String s) {

        while (s.length() > 30) {
            System.out.println("String is over 30 symbols. Try again: ");
            getString();
        }
            String str = s.replace("a", "@");
            String str1 = str.replace("o", "0");
            System.out.println("\nResult string: " + str1 + "\n");
        }
}