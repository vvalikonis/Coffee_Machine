import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int checkNum = scanner.nextInt();
        int sum = 0;
        for (int j : arr) {
            if (j > checkNum) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}