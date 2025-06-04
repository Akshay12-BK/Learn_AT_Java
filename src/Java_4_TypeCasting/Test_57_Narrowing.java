package Java_4_TypeCasting;

public class Test_57_Narrowing {
    public static void main(String[] args) {

        long phone_No = 781574544;

       //  short s = phone_No; // Narowing : Implicit
        short s2 = (short) phone_No;  // Explicit: Manually

        System.out.println(s2);


        // 781574544 this convert in binary then it contain only short allow and give output
    }
}
