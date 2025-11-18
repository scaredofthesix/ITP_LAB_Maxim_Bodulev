import java.util.Scanner;
public class lab6_4{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String y = s.nextLine();
        int result = x.compareTo(y);
        if (result == 0){
            System.out.println("lexicographically");
        }
        else{
            System.out.println("NO");
        }
    }
}
