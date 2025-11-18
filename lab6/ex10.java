public class lab6_10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 99;
        int position = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = element;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.print("original: ");
        printArray(arr);

        System.out.print("new: ");
        printArray(newArr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
