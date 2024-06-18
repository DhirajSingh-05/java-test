package Programs;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();

        int Sum=0;
        while(num>0){
            Sum=Sum+num%10;
            num=num/10;
        }
        System.out.println("The Sum of Digits is: "+Sum);

    }
}
