package Java_4_TypeCasting;

public class Test_56_Narrowing {
    public static void main(String[] args) {

        int  a = 300;
       //  byte b = a;  Implicit JVM to do it  // Narrowing : Chances to data loss

       byte b1 = (byte) a; // Narrowing: Explicit
        System.out.println(b1);

    }
}
