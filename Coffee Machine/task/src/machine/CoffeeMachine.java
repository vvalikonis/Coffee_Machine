package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner scanner = new Scanner(System.in);

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        switch (scanner.next()) {
            case "1":
                if (water < 250 || beans < 16 || cups < 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    return;
                }

                water -= 250;
                beans -= 16;
                money += 4;
                --cups;
                break;
            case "2":
                if (water < 350 || milk < 75 || beans < 20 || cups < 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    return;
                }

                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                --cups;
                break;
            case "3":
                if (water < 200 || milk < 100 || beans < 12 || cups < 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    return;
                }

                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                --cups;
                break;
            case "back":
                return;
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void printStatistic() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printStatistic();
                    break;
                case "exit":
                    return;
            }
        }
    }
}
