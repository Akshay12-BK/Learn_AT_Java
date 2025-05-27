package Loop;

import java.util.Scanner;

public class Test_07_while {
    public static void main(String[] args) {
        // Factorial program
        // Logic building program
        Scanner s1 = new Scanner(System.in);
        System.out.println("Welcome to the factorial program");
        System.out.println("Enter the number, whose factorial you want");

       // if(s1.hasNextInt()){
         //   System.out.println("Enter the int, rerun the program");
       // }
        int no = s1.nextInt();
        int factorial =1;

        if(no <=0){
            System.out.println("Factorial is:: "+ factorial);
        }

        int i =1;
        while (i<=no){
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial is:"+factorial);




    }
}
