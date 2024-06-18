package Programs;

import java.util.Scanner;

public class StrReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.next();
//
//        String rev = " ";
//        int len = str.length();
//        for(int i = len-1;i>=0;i--){
//            rev = rev+str.charAt(i);
//        }

//        StringBuffer sb = new StringBuffer(str);
//        StringBuffer rev = sb.reverse();


        String rev=" ";
        char a[]=str.toCharArray();
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev =rev+a[i];
        }

        System.out.println("Reverse String: "+rev);

    }
}
