import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int counter = 1;
        int maxLength = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                counter++;
            } else if (counter >= maxLength) {
                maxLength = counter;
                counter = 1;
            }
        }
        if (counter > maxLength) {
            maxLength = counter;
        }
        System.out.println(maxLength);
    }
}