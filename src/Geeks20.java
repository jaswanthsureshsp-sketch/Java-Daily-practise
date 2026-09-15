class Geeks20 {
    public static void main(String[] args) {
        int marks = 199;


        if (marks >= 0 && marks <= 100)
            if (marks >= 75) {
                System.out.println("Distinction");
            } else if (marks >= 50) {
                System.out.println("Passed");
            } else {
                System.out.println("Fail");
            } else {
                System.out.println("Invalid marks");
            }
    }
}
        