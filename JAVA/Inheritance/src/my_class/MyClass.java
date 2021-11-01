package my_class;

public class MyClass {
    int a;
    int b;
    MyClass(int i, int j){
        a = i;
        b = j;
    }
    MyClass(int i){
        //a = i;
        //b = i;
        this(i,i);
    }
    MyClass(){
        //a = 0;
        //b = 0;
        this(0);
    }
}
