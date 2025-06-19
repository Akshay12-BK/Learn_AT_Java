package Java_5_Ternary_Operator;

public class Test_61_Ternary {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1? expression1:(condition2: expression2: expression3);

        int no = 26;
        String result = (no>18)? (no >25? "In Goa, You can drink": "You can't drink"): "You can't go Goa";
        System.out.println(result);

    }
}
