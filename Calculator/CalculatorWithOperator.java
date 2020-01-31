package Calculator;

public class CalculatorWithOperator {
    public int counter;


    public double  plus(double  a, double  b){
        return a + b;

    }
    public double  minus (double  a, double  b){
        return a - b;

    }
    public double  multi (double  a, double  b){
        return a * b;

    }
    public double  divide (double  a, double  b){
        return a / b;

    }
    public double power (double a, int b){
        for (int i=2; i<=b; i++){
            a = a*a;
        }
        return a;
    }
}
