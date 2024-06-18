package Programs;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 1st Number: ");
        int num1=sc.nextInt();

        System.out.println("Enter Your 2nd Number: ");
        int num2=sc.nextInt();

        System.out.println("Enter Your 3rd Number: ");
        int num3=sc.nextInt();

//        if(num1>num2 && num1>num3){
//            System.out.println(num1+" is the Greatest");
//        }
//        else if (num2>num1 && num2>num3) {
//            System.out.println(num2+" is the Greatest");
//        }
//        else{
//            System.out.println(num3+" is the Greatest");
//        }

//        int largest1=num1>num2?num1:num2;
        int largest2=num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);

        System.out.println(largest2+" is the highest");
    }
}
