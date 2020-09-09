import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) < 0 || arr[i].compareTo(arr[i + 1]) == 0) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}