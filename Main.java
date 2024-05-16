import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc calc = Calc.getInstance();
        System.out.println("Введите значение X");
        double x = input.nextInt();
        System.out.println("Введите значение Y");
        double y = input.nextInt();
        System.out.println(calc.calculate(x, y));
    }
}
class Calc {
    private static Calc calc = new Calc();
    private Calc() {
    }
    public static Calc getInstance() {
        return calc;
    }
    public double calculate(double x, double y) {
        if(y == 0){
            System.out.println("Error");
            return -1;
        }else {
            return  (2 * x + 3)/y;
        }
    }
}