import java.io.File;
public class lab6_12 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
