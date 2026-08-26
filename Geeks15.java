public class Geeks15 {
    public static void main(String[] agrs){
        checkLogin("Admin", "Pass123");
    }
    public static void checkLogin(String username, String pass){
        if(username.equals("Admin")){
            if(pass.equals("Pass123")){
                System.out.println("Login SuccessFull");
            } else {
                System.out.println("Incorrect Password");
            }

        } else {
            System.out.println("user Not found");
        }
    }
}