//a program that implements the fibonacci series
package com.tgt.igniteplus;
import java.util.*;
public class FibSeries {
    public static void main(String[] args){
        int[] a=new int[30];
        a[0]=1;
        a[1]=1;
        int n;
        System.out.print("enter the number of terms: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.print(a[0]+" "+a[1]+" ");
        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
        }
    }
}
/*OUTPUT:
enter the number of terms: 6
1 1 2 3 5 8
 */