//a program to print the sequence -1,2,-3,4,-5......N
package com.tgt.igniteplus;
import java.util.Scanner;
public class Alternate {
    public static void main(String[] args){
        int n;
        System.out.print("enter the number of terms: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print(i*(-1)+" ");
        }
    }
}
/*OUTPUT:
enter the number of terms: 6
-1 2 -3 4 -5 6
 */
