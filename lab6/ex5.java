import java.util.Scanner;
public class lab6_5{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String sogl = "aeiouAEIOU";
        String x = s.next();
        int count = 0;
        for(int i = 0 ;i < x.length();i++){
            char element = x.charAt(i);
            if (sogl.indexOf(element) != -1){
                count +=1;
            }
        }
    System.out.println(count);
    }
}
