// program to concatenate two strings.
package com.tgt.igniteplus;
import java.util.*;
public class Concatenation {
    public static void main(String[] args){
        String s1,s2;
        System.out.print("enter the first string ");
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
        System.out.print("enter the second string ");
        s2=in.nextLine();
        String s=s1+" "+s2;
        System.out.print("the new concatenated string is : "+s);
    }
}
/*OUTPUT:
enter the first string hello
enter the second string world
the new concatenated string is : hello world
 */
