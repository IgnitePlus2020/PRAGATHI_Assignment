//program to calculate the largest number from the given three numbers using
//ternary operator.
package com.tgt.igniteplus;
import java.util.*;
public class LargeTernOp {
    public static void main(String[] args){
        int a,b,c;
        System.out.print("enter the 3 numbers");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int big=a>b?(a>c?a:c):(b>c?b:c);
        System.out.print("the largest of the 3 numbers is "+big);
    }
}
/*OUTPUT:
enter the 3 numbers10 20 30
the largest of the 3 numbers is 30
 */