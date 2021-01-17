package super1;

public class B extends A{
    int i;

    public B(int a, int i) {
        super.i = a; //'i' from class A
        this.i = i; //'i' from class B
    }
    void snow(){
        System.out.println("'i' в суперкласе " + super.i);
        System.out.println("'i' в подкласе " + i);

    }
}
