package lista1;

public class Numero2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "| ");
        }
    }
}