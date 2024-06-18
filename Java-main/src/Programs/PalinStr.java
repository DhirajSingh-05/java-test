package Programs;

import java.util.Scanner;

public class PalinStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();

        String org_str=str;
        String rev="";
        int len=str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String: "+rev);
        if(org_str.equals(rev)){
            System.out.println(org_str+" is a palindrome String");
        }
        else{
            System.out.println(org_str+" is not a palindrome String");
        }
    }
}
