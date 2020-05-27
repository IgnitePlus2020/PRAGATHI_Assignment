/*a program to calculate sum of even and odd numbers separately till a given range*/
package com.tgt.igniteplus;
import java.util.*;
public class Sum {
    public static void main(String[] args){
        int n,oddsum=0,evensum=0,i;
        System.out.print("enter the value until where sum must be calculated");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<=n;i+=2)
            evensum+=i;
        for(i=1;i<=n;i+=2)
            oddsum+=i;
        System.out.println("sum of even numbers="+evensum);
        System.out.println("sum of odd numbers="+oddsum);
    }
}
/*OUTPUT:
enter the value until where sum must be calculated6
sum of even numbers=12
sum of odd numbers=9
 */