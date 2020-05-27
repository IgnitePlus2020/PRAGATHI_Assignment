// a program to print series 1,-2,4,-6,7,-10,10.....N
package com.tgt.igniteplus;
import java.util.Scanner;
public class Sequence6 {
    public static void main(String[] args) {
        int n;
        System.out.print("enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1,j=-2; i <= n; i = i + 3,j=j-4)
            System.out.print(i +" "+j+" ");
    }
}
/*OUTPUT:
enter n: 5
1 -2 4 -6
 */
