import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        boolean check = false;

        for (int i : arr) {
            if (i == num) {
                check = true;
            }
        }
        System.out.println(check);
    }
}
