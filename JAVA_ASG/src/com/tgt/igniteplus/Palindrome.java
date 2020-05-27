// a program to check if an entered string is palindrome or not(case sensitive)
package com.tgt.igniteplus;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        System.out.print("enter a string:");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev=rev+s.charAt(i);
        if(s.equals(rev))
            System.out.print("the entered string is a palindrome");
        else
            System.out.print("the entered string is not a palindrome");
    }
}
/*OUTPUT:
enter a string:MAAM
the entered string is a palindrome

enter a string:TARGET
the entered string is not a palindrome
 */