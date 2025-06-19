package Java_5_Ternary_Operator;

public class Test_64_ThreeMax_No {
    public static void main(String[] args) {

        int n1 = 25;
        int n2 = 8;
        int n3 = 15;

        // Logic building
        // Step 1 - Input - Output- Datatype
        // Input - int n1, n2 and n3
        // Output = int no = Max no
        // Step no 2 Rough logic
        // n1 >n2 && n1>n3 -- n1
        // n2 >n3 && n2>n1 -- n2
        // n3

        // Step no 3 Dry run program

        int max = (n1>n2) ? (n1>n3)? n1:n3 : ((n2>n3)? n2:n3);
        System.out.println(max);


    }
}
