import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileIO {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Students.txt");

            int data;

            while((data = fis.read()) != -1) {
                System.out.println((char) data);
            }

            fis.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error: File Not Found");
        } catch (IOException e) {
            System.out.println("Error While Reading the File");
        }
    }
}