//a program to print prime numbers in a given range
package com.tgt.igniteplus;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int n,m;
        System.out.print("enter the range to list the prime numbers: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        while(n<m){
            boolean flag=false;
            for(int i=2;i<=n/2;++i){
                if(n%i==0){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                System.out.print(n+" ");
            n++;
        }
    }
}
/*OUTPUT:
enter the range to list the prime numbers: 6 13
7 11
 */