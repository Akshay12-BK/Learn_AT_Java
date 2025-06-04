package Java_4_TypeCasting;

public class Test_58_Type_Cast {
    public static void main(String[] args) {
        int course= 100;
        float GST = 10.15f;
     //   int total = course+GST;  : Implicit Narrowing

        int total = course+(int)GST;  // Explicit Narrowing
       System.out.println(total);

       float total1 = course+GST;   // Widening - Implicit
        float total2 = (float)course+GST;   // Widening - Explicit

        System.out.println(total1);
        System.out.println("===========");
        System.out.println(total2);


    }
}
