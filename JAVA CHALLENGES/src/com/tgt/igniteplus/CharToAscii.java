//a program to find the ASCII value of the character
package com.tgt.igniteplus;
import java.util.Scanner;
public class CharToAscii {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the character whose ASCII value is to be found ");
        char s = in.next().charAt(0);
        System.out.println("the ASCII value of"+s+" is "+(int)s);
    }
}
/*OUTPUT:
enter the character whose ASCII value is to be found A
the ASCII value ofA is 65
 */