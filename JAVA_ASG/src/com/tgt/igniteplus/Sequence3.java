//a program to print sequence 1,4,9,25,36,49......N
package com.tgt.igniteplus;
import java.util.Scanner;
public class Sequence3 {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the value of n: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for (int i = 1; i <= n+1; i++) {
            if (i==4)
                continue;
            System.out.print(i * i + "  ");
        }
    }
}
/*OUTPUT:
enter the value of n: 5
1  4  9  25  36
 */