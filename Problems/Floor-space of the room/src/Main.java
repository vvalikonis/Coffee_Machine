import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        double r;
        double p;
        switch (in.next()) {
            case "triangle":
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = in.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            default:
                System.out.println("bad shape");
                break;
        }
    }
}