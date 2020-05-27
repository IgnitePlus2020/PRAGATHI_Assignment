//a program to find the roots of a quadratic equation ax2+bx+c=0. x1 and x2 are the 2 roots
package com.tgt.igniteplus;
import java.util.*;
public class ElseIfLadder {
    public static void main(String[] args){
        float a,b,c,disc;
        double x1,x2;
        System.out.println("enter the coefficients");
        Scanner in=new Scanner(System.in);
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        disc=b*b-4*a*c;
        if(disc>0){
            x1=(-b+Math.sqrt(disc))/(2*a);
            x2=(-b-Math.sqrt(disc))/(2*a);
            System.out.println("The roots are distinct");
            System.out.print("x1="+x1+"  x2="+x2);
        }
        else if(disc==0){
            x1=x2=-b/(2*a);
            System.out.println("The roots are equal");
            System.out.print("x1="+x1+"  x2="+x2);
        }
        else{
            x1=-b/(2*a);
            x2=Math.sqrt(Math.abs(disc))/(2*a);
            System.out.println("The roots are complex");
            System.out.println("first root = "+x1+"+i"+x2);
            System.out.print("second root = "+x1+"-i"+x2);
        }
    }
}

/*sample output
1.enter the coefficients
  1 -5 6
  The roots are distinct
  x1=3.0  x2=2.0
2.enter the coefficients
  1 -4 4
  The roots are equal
  x1=2.0  x2=2.0
3.enter the coefficients
6 2 4
The roots are complex
first root = -0.1666666716337204+i0.7993052538854531
second root = -0.1666666716337204-i0.7993052538854531
 */