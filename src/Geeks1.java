import java.util.Scanner;


public class Geeks1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username : ");
        String name = scanner.nextLine();

        System.out.print("Password : ");
        String psswd = scanner.nextLine();

        System.out.print("True/False : ");
        boolean bool = scanner.nextBoolean();

        System.out.println("Your username = " + name);
        System.out.println("Your password = " + psswd);
        System.out.println( bool );

        scanner.close();

    }
}
