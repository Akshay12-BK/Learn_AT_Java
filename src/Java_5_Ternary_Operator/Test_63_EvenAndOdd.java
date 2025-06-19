package Java_5_Ternary_Operator;

public class Test_63_EvenAndOdd {
    public static void main(String[] args) {
        // Step no 1 = Input - Output - Datatype
        int no = 9;
        int no1 = 4;
        // Input = int
        // Output= String - Even or Odd
        // Step no - 2 Rough logic
        // no%2 ==0 > Even else 1 Odd

        String result = (no%2==0)? "Even": "Odd";
        System.out.println(result);

        System.out.println("=================");

        String result1 = (no1%2==0)? "Even": "Odd";
        System.out.println(result1);

        // Edge cases
        // negative no -12, -13 float no,,,, o no

    }
}
