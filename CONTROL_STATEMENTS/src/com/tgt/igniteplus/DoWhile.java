//program to find sum of natural numbers from 1 to n where n is given as input from user
package com.tgt.igniteplus;
import java.util.*;
public class DoWhile {
    public static void main(String[] args){
        int n,sum,i;
        System.out.println("Enter the number of terms : ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        sum=0;
        i=1;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println("sum of series from 1 to "+n+" is : "+sum);
    }
}
/*Sample output
Enter the number of terms :
5
sum of series from 1 to 5 is : 15
 */