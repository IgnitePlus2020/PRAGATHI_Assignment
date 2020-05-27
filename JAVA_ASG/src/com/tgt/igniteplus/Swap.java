//a program to swap 2 numbers
package com.tgt.igniteplus;
import java.util.*;
public class Swap {
    public static void main(String[] args){
        int a,b,temp;
        Scanner in=new Scanner(System.in);
        System.out.print("enter 2 numbers  ");
        a=in.nextInt();
        b=in.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("the numbers after swapping is "+a+"\t"+b);
    }
}
/*OUTPUT:
enter 2 numbers  10 20
the numbers after swapping is 20	10
 */