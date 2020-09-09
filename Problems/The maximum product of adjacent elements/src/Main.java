import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int mp = arr[i] * arr[i + 1];
            if (mp >= max) {
                max = mp;
            }
        }
        System.out.println(max);
    }
}