package Java_3_Operators;

public class Test_44_Interview {
    public static void main(String[] args) {

        int Akshay_Salary = 15;

        boolean b = Akshay_Salary < 5 || Akshay_Salary <10;
        System.out.println(b);

        System.out.println("===================");
        boolean b1 = !(Akshay_Salary < 5 || Akshay_Salary <10);
        System.out.println(b1);

        System.out.println("===================");
        boolean b2 = !(Akshay_Salary > 5 || Akshay_Salary <10);
        System.out.println(b2);

        System.out.println("===================");
        boolean b3 = (Akshay_Salary > 5 || Akshay_Salary <10);
        System.out.println(b3);
    }
}
