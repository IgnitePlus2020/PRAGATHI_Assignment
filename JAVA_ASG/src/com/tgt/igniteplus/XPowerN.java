//a program to calculate x power n without builtin function
package com.tgt.igniteplus;
import java.util.Scanner;
public class XPowerN {
    public static void main(String[] args){
        int x,n,m,val=1;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the base value x:");
        x=in.nextInt();
        System.out.print("enter the exponent value n:");
        n=in.nextInt();
        m=n;
        if(x==0){
            System.out.print("0");
        }
        else {
            while (n != 0) {
                val = val * x;
                n--;
            }
            System.out.print("value of" + x + "^" + m + ":" + val);
        }
    }
}
/*OUTPUT:
enter the base value x:2
enter the exponent value n:3
value of2^3:8
 */