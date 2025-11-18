public class lab6_8{
    public static void main(){
        int x = 555;
        String binary = Integer.toBinaryString(x);
        String hex = Integer.toHexString(x).toUpperCase();
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + binary);
        System.out.println("Hex: " + hex);
    }
}
