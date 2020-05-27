//a program that converts binary number to decimal equivalent
package com.tgt.igniteplus;
import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args){
        int dec_value=0;
        int base=1;
        int n;
        System.out.print("enter the number in binary: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int temp=n;
        while(temp > 0){
            int last_digit=temp%10;
            temp=temp/10;
            dec_value+=last_digit*base;
            base=base*2;
        }
        System.out.print("the equivalent decimal number is "+dec_value);
    }
}
/*OUTPUT:
enter the number in binary: 1000
the equivalent decimal number is 8
 */