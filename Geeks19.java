public class Geeks19
{
    public static void main(String[] args) {
        int num = 131;

        if (num > 0 && num % 2 == 0) {
            System.out.println("Positive and Even Number");
        } else if ( num > 0 && num % 2 != 0){
            System.out.println("Positive and Odd Number");
        } else if (num < 0 && num % 2 == 0){
            System.out.println("Negative and Even Number");
        }else if (num < 0 && num % 2 != 0){
            System.out.println("Negative and Odd Number");
        } else {
            System.out.println("Zero");
        }
    }
}
