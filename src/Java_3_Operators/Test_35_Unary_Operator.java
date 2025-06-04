package Java_3_Operators;

public class Test_35_Unary_Operator {
    public static void main(String[] args) {
        int a= +10; // + Unary operator

        System.out.println(a);  // 10

        int b = -10;
        System.out.println(b);
        System.out.println(a+a+b);
        System.out.println("=========================");

        int c = 5;
        int d= ++c; // Pre Increment
        int e= c--; // Post Increment
        System.out.println(d);
        System.out.println(e);



    }
}
