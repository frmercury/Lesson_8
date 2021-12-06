import java.util.Scanner;

public class Login {

    // Login: login
    // Password: password

    public static String getLogin() {
        System.out.printf("Login: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getPassword() {
        System.out.printf("Password: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        int number;

                do {
                    System.out.println("1. Even Number task");
                    System.out.println("2. Reverse task");
                    System.out.println("3. Armstrong task");
                    System.out.println("4. Fibonacci task");
                    System.out.println("5. Replace task");
                    System.out.print("Please enter number of the listed task above or press \"0\" to quit the program: ");

                    while (!scanner.hasNextInt()) {

                            String input = scanner.next();
                            System.out.printf("\"%s\" is not a number.%n", input);
                            System.out.print("Please enter correct number: ");
                        }
                        number = scanner.nextInt();
                        if (number == 0) {
                            System.out.println("Program has been terminated");
                            System.exit(0);
                        }

                } while (number < 0 || number > 5) ;
                return number;
    }

    public static void credentialsCheck (String login, String password){
        String userLogin = "login";
        String userPassword = "password";

        if (login.equals(userLogin) && password.equals(userPassword)) {
            int numberOfTries = 3;
            for (int i = 0; i < numberOfTries; i++) {
                switch (getOption()) {
                    case 1:
                        System.out.println("\nTask #1\n");
                        EvenNumber task1 = new EvenNumber();
                        task1.oddEven(task1.getInt());
                        break;
                    case 2:
                        System.out.println("\nTask #2\n");
                        Reverse task2 = new Reverse();
                        task2.getReverseString(task2.getString());
                        break;
                    case 3:
                        System.out.println("\nTask #3\n");
                        Armstrong task3 = new Armstrong();
                        task3.armstr(task3.getInt());
                        break;
                    case 4:
                        System.out.println("\nTask #4\n");
                        Fibonacci task4 = new Fibonacci();
                        task4.fib(task4.getInt());
                        break;
                    case 5:
                        System.out.println("\nTask #5\n");
                        Replace task5 = new Replace();
                        task5.replaceSymbols(task5.getString());
                        break;
                    default:
                        System.out.println("Program ended");
                        break;
                }
                if (i != (numberOfTries - 1)) { System.out.println("Left tries: " + ((numberOfTries - 1) - i));
                } else {
                    System.out.println("\nProgram is over. Thank you for choosing our product. Have a nice day!");
                }
            }
        } else {
            System.out.println("Wrong credentials. Try again");
        }
    }
    public static void main(String[] args) {
        credentialsCheck(getLogin(),getPassword());
    }
}