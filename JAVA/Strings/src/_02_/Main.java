package _02_;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("length = " + stringBuffer.length());
        System.out.println("size = " + stringBuffer.capacity());
        //stringBuffer = "java"; ERROR, only with class String

        stringBuffer.append("java");
        System.out.println("line = " + stringBuffer);
        System.out.println("length = " + stringBuffer.length());
        System.out.println("size = " + stringBuffer.capacity());
        System.out.println("reverse = " + stringBuffer.reverse());
    }
}
