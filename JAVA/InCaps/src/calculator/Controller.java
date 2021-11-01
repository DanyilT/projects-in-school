package calculator;

public class Controller {
    int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    int dif(int a, int b){
        return a - b;
    }
    int mul(int a, int b){
        return a * b;
    }
    double div(int a, int b){
        if (b != 0) {
            return (double) a / b;
        }else {
            return 0;
        }
    }
}