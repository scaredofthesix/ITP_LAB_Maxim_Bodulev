import java.util.Scanner;
public class lab6_1{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }
}
