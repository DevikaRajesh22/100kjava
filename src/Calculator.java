import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalculatorClass obj = new CalculatorClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("----MENU----");
        System.out.println("1-ADDITION\n2-SUBTRACTION\n3-MULTIPLICATION\n4-DIVISION");

            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> obj.add(num1, num2);
                case 2 -> obj.sub(num1, num2);
                case 3 -> obj.mul(num1, num2);
                case 4 -> obj.div(num1, num2);
                default -> System.out.println("Invalid option");
            }


}
}
