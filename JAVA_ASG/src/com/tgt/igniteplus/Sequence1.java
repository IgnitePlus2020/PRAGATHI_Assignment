//a program to print sequence 1,4,27,256,3125......N
package com.tgt.igniteplus;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Sequence1 {
    public static void main(String[] args){
        int n;
        System.out.print("enter the number of terms: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
                System.out.print((int)pow(i,i)+" ");
    }
}
/*OUTPUT:
enter the number of terms: 5
1 4 27 256 3125
 */
