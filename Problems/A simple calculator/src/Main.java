import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long fN = in.nextLong();
        String op = in.next();
        long sN = in.nextLong();

        switch (op) {
            case "+":
                System.out.println(fN + sN);
                break;
            case "-":
                System.out.println(fN - sN);
                break;
            case "/":
                if (sN == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(fN / sN);
                }
                break;
            case "*":
                System.out.println(fN * sN);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}