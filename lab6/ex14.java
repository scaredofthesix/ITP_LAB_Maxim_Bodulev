import java.io.*;

public class lab6_14 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("input1.txt");
        FileOutputStream out = new FileOutputStream("output.txt");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }
}
