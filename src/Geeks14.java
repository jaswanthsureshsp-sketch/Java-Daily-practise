import java.util.Scanner;

public class Geeks14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name, Age, Height, Grade");

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your Name is:  " + name);

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Your Age is: " + age);

        System.out.print("Enter Your Height: ");
        float  height = scanner.nextFloat();
        System.out.println("Your Height is: " + height);

        System.out.print("Enter Your Grade: ");
        char grade = scanner.next().charAt(0);
        System.out.println("your Grade is: " + grade);

        System.out.println("your Name is: " + name);
        System.out.println("Your Age is: " + age);
        System.out.println("Your Height is: " + height);
        System.out.println("Your Grade is: " + grade);
        scanner.close();

    }

}
