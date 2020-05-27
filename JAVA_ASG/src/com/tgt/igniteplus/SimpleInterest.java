//a program to calculate simple interest
package com.tgt.igniteplus;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        float p,r,t,si;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = in.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = in.nextFloat();
        System.out.print("Enter the Time period : ");
        t = in.nextFloat();
        si = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
    }
}
/*OUTPUT:
Enter the Principal : 1000
Enter the Rate of interest : 3
Enter the Time period : 3
Simple Interest is: 90.0
 */