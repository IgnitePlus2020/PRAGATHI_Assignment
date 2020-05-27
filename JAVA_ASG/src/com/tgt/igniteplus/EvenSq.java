//a program to print the squares of an even number in the given limit
package com.tgt.igniteplus;
import java.util.Scanner;
public class EvenSq {
    public static void main(String[] args){
        int n;
        System.out.print("enter the max number whose square is to be found: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=2;i<=n;i+=2)
            System.out.print(i*i+"  ");
    }
}
/*OUTPUT:
enter the max number whose square is to be found: 6
4  16  36
 */