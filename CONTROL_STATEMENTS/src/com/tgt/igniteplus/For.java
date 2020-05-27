//a program to find the factorial of a given number 'num' which is given as input from the user
package com.tgt.igniteplus;
import java.util.*;
public class For {
    public static void main(String[] args){
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number whose factorial is to be found");
        num=in.nextInt();
        long fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}

/*Sample output:
enter the number whose factorial is to be found
5
Factorial of 5 is: 120
 */