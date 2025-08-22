//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = (int a, int b) -> a + b;
        int sum = calc.calculate(5, 10);
        System.out.println("Sum: " + sum);

        Calculator mult = (int a, int b) -> a * b;
        int product = mult.calculate(5, 3);
        System.out.println("Product: " + product);
    }
}