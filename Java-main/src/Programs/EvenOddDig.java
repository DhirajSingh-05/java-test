package Programs;

import java.util.Scanner;

public class EvenOddDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num=sc.nextInt();

        int even_count=0;
        int odd_count=0;

        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                even_count++;
            }
            else {
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("The number of Even digits is: "+even_count);
        System.out.println("The number of Odd digits is: "+odd_count);

    }
}
