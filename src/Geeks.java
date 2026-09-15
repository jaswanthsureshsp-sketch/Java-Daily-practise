import java.util.Scanner;
public class Geeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int Age = scanner.nextInt();


        System.out.print("Enter Your Mark: ");
        double Mark = scanner.nextDouble();

        System.out.print("Enter Your Rank : ");
        int Rank = scanner.nextInt();

        System.out.print(" Have You Ate Biryani (True/False) :");
        boolean balloon = scanner.nextBoolean();

        System.out.println( Name );
        System.out.println("Your are " + Age + " Years old");
        System.out.println("Your Mark is : " + Mark );
        System.out.println("Your Rank is : " + Rank);
        System.out.println(balloon);
        scanner.close();

    }
}
