import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = new int[length];

        for (int j = 0; j < length; j++) {
            arr2[(j + 1) % length] = arr[j];
        }


        for (int result : arr2) {
            System.out.print(result + " ");
        }

    }
}