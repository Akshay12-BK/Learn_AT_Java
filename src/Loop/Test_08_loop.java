package Loop;

import java.util.Scanner;

public class Test_08_loop {
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

            if(no ==0){
                System.out.println("Factorial is:: "+ factorial);

            }
            if (no > Integer.MAX_VALUE) {
                System.out.println("Can't get the factorial as out of bound!(int)");
            }

            int i =1;
            while (i<=no){
                factorial=factorial*i;
                i++;
            }
            System.out.println("Factorial is:"+factorial);




        }
}
