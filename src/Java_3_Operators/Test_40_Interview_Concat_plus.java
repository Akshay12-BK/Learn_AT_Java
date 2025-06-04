package Java_3_Operators;

public class Test_40_Interview_Concat_plus {
    public static void main(String[] args) {
        String f1= "Akshay";
        String l1= "GArdi";

        int a= 10, b= 20;

        System.out.println(f1+l1+" "+a+b); // String is first so it will not perform addition
        System.out.println("=============");
        System.out.println(f1+a+b+" "+f1+l1); // Akshay1020 AkshayGArdi
        System.out.println(a+b+f1+l1);
        System.out.println("=============");
        System.out.println(f1+l1+(a+b));
    }
}
