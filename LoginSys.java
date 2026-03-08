import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        Scanner sc = new Scanner(System.in);
        String u, p;

        do {
            System.out.print("Enter username: ");
            u = sc.nextLine();

            System.out.print("Enter password: ");
            p = sc.nextLine();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid username or password. Try again.");
            }
        } while (!u.equals(username) || !p.equals(password));

        sc.close();
    }
}
