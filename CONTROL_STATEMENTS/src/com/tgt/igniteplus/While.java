//a program to reverse a number
package com.tgt.igniteplus;
import java.util.*;
public class While {
    public static void main(String[] args){
        int num,rev=0;
        System.out.print("Enter the number to be reversed:");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
/*Sample output:
Enter the number to be reversed:1234
Reversed Number: 4321
 */