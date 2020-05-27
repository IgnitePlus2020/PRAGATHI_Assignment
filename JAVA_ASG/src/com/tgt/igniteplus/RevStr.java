//a program to reverse a given string
package com.tgt.igniteplus;
import java.util.Scanner;
public class RevStr {
    public static void main(String[] args){
        System.out.print("enter the string to be reversed:");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev=rev+s.charAt(i);
        System.out.print("the reversed string is:"+rev);
    }
}
/*OUTPUT:
enter the string to be reversed:TARGET
the reversed string is:TEGRAT
 */