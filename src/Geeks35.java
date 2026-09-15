/*
public class Geeks35 {

    public static void main(String[] args) {
        int N = 15;
        if( N % 3 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
    }
}
*/

/*
class Geeks35 {
    public static void main(String[] args) {
        int N = 17;
        if( N % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
 */

/*

class Geeks35 {
    public static void main(String[] args) {

        int N = 12;

        if( N > 0 ){
            System.out.println("Positive");
        } else if (N < 0){
            System.out.println("negative");

        } else {
            System.out.println("Zero");
        }

    }
}

 */
/*

class Geeks35 {
    public static void main(String[] args) {


        for(int i = 1; i<=20; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}



 */

class Geeks35 {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1 ; i <= 20; i++){
            if(i % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}


