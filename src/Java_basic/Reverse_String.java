package Java_basic;

public class Reverse_String {
    public static void main(String[] args) {
        Reverse_String ref = new Reverse_String();
        ref.firstMethod();
        ref.SecondMethod();
        String str = "Bubu";
        String reversed = new
        StringBuilder(str).reverse().toString();
        System.out.println("Reversed string is:"+reversed);

        System.out.println("StringBuilder has a reverse() method which directly reverse the string");

    }

    public void firstMethod()
    {
        String s1 = "Dudu";
        String s2= new
        StringBuilder(s1).reverse().toString();
        System.out.println("Reversed string is:"+s2);
    }

    public void SecondMethod(){

        String s1 = "Akshay";
        String s2= new
                StringBuilder(s1).reverse().toString();
        System.out.println("Reversed string is:"+s2);

    }
}
