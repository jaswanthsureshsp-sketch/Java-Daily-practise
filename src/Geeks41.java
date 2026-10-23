import java.util.Scanner;
class Geeks41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int N = scanner.nextInt();
        if(N > 0) {
            System.out.println("Positive Number");
                for(int i =2; i <= N; i+=2) {
                    System.out.print(i + " ");
                }
            }
        else if(N < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
        scanner.close();

        }
}

