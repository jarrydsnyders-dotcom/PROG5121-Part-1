//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String regUsername = "";
        String regPassword = "";

        while (true) {
            System.out.print("Enter First Name: ");
            firstName = scanner.nextLine();

            if (firstName.matches("^[A-Z][a-zA-Z]*$")) {
                break;
            }

            System.out.println(
                    "Invalid First Name. Must start with a capital letter and contain only letters."
            );
        }

        // Last Name
        while (true) {
            System.out.print("Enter Last Name: ");
            lastName = scanner.nextLine();

            if (lastName.matches("^[A-Z][a-zA-Z]*$")) {
                break;
            }

            System.out.println(
                    "Invalid Last Name. Must start with a capital letter and contain only letters."
            );
        }

        while (true) {
            System.out.print("Enter Username: ");
            regUsername = scanner.nextLine();

            if (regUsername.length() <= 10 && !regUsername.contains(" ")) {
                break;
            }

            System.out.println(
                    "Invalid Username. Must be maximum 10 characters and contain no spaces."
            );
        }

        // Password
        while (true) {
            System.out.print("Enter Password: ");
            regPassword = scanner.nextLine();

            boolean hasUpper = !regPassword.equals(regPassword.toLowerCase());
            boolean hasLower = !regPassword.equals(regPassword.toUpperCase());

            if (regPassword.length() >= 6 && hasUpper && hasLower) {
                break;
            }

            System.out.println(
                    "Invalid Password. Must be at least 6 characters " +
                            "and contain both uppercase and lowercase letters."
            );
        }

        System.out.println("\nRegistration successful!\n");

        while (true) {
            System.out.print("Enter Login Username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter Login Password: ");
            String loginPassword = scanner.nextLine();

            if (loginUsername.equals(regUsername)
                    && loginPassword.equals(regPassword)) {
                break;
            }

            System.out.println(
                    "Incorrect username or password. Please try again.\n"
            );
        }

        System.out.println("Welcome " + firstName + " " + lastName + "!");

        scanner.close();
    }
}