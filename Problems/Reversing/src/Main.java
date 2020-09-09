import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int temp1 = num1 % 10;
        int temp2 = num1 / 10 % 10;
        int num2 = temp1 * 100 + temp2 * 10 + num1 / 100;
        System.out.println(num2);
    }
}