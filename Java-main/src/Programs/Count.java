package Programs;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num=sc.nextInt();
        int count=0;

        while(num>0){
            num=num/10;
            count++;
        }

        System.out.println("There are "+count+" digits in given number");
    }
}
