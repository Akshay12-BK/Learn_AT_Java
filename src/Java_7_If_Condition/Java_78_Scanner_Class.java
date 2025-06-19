package Java_7_If_Condition;

import java.util.Scanner;

public class Java_78_Scanner_Class {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = s1.nextInt();
        if (age>18){
            System.out.println("User allowed to vote");
        }
        else {
            System.out.println("User not allowed to vote");
        }

    }
}
