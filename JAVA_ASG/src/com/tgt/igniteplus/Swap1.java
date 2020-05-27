//a program to swap 3 numbers
package com.tgt.igniteplus;
import java.util.*;
public class Swap1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.print("enter 3 numbers  ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("the numbers after swapping is "+a+"\t"+b+"\t"+c);
    }
}
/*OUTPUT:
enter 3 numbers  10 20 30
the numbers after swapping is 30	10	20
 */