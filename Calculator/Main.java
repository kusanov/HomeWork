package Calculator;

public class Main {
    public static void main(String[] args) {

        CalculatorWithOperator Сalculator = new CalculatorWithOperator();
        double  total = Сalculator.plus(Сalculator.plus(4.1, Сalculator.multi( 15, 7 )),
                Сalculator.power(Сalculator.divide(28,5),2));
        System.out.println(total);

        CalculatorWithMath Сalculator2 = new CalculatorWithMath();
        double  tota2 = Сalculator2.plus2(Сalculator2.plus2(4.1, Сalculator2.multi2( 15, 7 )),
                Сalculator2.power2(Сalculator2.divide2(28,5),2));
        System.out.println(tota2);


    }
}
