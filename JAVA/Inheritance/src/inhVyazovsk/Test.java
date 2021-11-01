package inhVyazovsk;

public class Test {
    public Object getTest(){
        return this;
    }
    public static void main(String[] args) {
     Test T = new Test();
     System.out.println(T.getTest() == T);
    }
}
