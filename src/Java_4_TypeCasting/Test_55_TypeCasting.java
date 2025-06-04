package Java_4_TypeCasting;

public class Test_55_TypeCasting {
    public static void main(String[] args) {
        byte a = 10;        // Byte < Int
        int b= a;  // Widening:  Implicit casting  - Automatically done

        int b1 = (int)a; // Explicit casting done my manually [It is optional]
    }
}
