package calculator2;

public class Controller {
    static int add(Model m){
        int sum = m.x + m.y;
        return sum;
    }
    static int dif(Model m){
        return m.x - m.y;
    }
    static int mul(Model m){
        return m.x * m.y;
    }
    static double div(Model m){
        if (m.y != 0) {
            return (double) m.x / m.y;
        }else {
            return 0;
        }
    }
}