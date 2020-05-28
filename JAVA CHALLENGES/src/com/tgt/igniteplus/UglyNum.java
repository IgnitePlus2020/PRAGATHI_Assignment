/* program to check whether given number is an ugly number.
In number system, ugly numbers are positive numbers whose only prime factors are
2,3,5. */
package com.tgt.igniteplus;
import java.util.*;
public class UglyNum {
    public static void main(String[] args){
        System.out.print("enter the number to be checked : ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num<=0)
            System.out.print("invalid");
        int x=0;
        while(num!=1){
            if(num%5==0)
                num/=5;
            else if(num%3==0)
                num/=3;
            else if(num%2==0)
                num/=2;
            else{
                System.out.print("it is not an ugly number");
                x=1;
                break;
            }
        }
        if(x==0)
            System.out.println("it is an ugly number");
    }
}
/*OUTPUT:
enter the number to be checked : 6
it is an ugly number

enter the number to be checked : 11
it is not an ugly number
 */