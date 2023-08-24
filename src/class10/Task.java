package class10;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String user = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        System.out.println("Please confirm the password");
        String confirm = scanner.nextLine();

        if (user.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(user)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirm)) {
            System.out.println("Password do no match");
        } else {
            System.out.println("Your username and password has been created");
        }


    }
}
