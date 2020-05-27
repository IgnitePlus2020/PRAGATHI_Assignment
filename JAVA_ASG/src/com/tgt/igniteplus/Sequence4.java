//a program to print sequence 1,5,13,29,49,77......N
package com.tgt.igniteplus;
import java.util.Scanner;
public class Sequence4 {
    public static void main(String[] args){
        int a=1;
        int n;
        System.out.print("enter the max i value: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<=n;i++) {
            if(i%3==0)
                continue;
            System.out.print(a+" ");
            a=a+4*i;
        }
    }
}
/*OUTPUT:
enter the max i value: 6
1 5 13 29
 */