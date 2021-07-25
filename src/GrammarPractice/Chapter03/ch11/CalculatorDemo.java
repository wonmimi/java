package GrammarPractice.Chapter03.ch11;

public class CalculatorDemo {
    public static void main(String[] args) {


        int num1 = (int) Calc.PI;
        int num2 = 2;
        // Calc Type 으로 구현한 CompleteCalc
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.devide(num1,num2));

        CompleteCalc calc2 = new CompleteCalc();
        calc2.showInfo();


    }
}
