/*a program to print a pyramid in the given fashion
 *
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *   */
package com.tgt.igniteplus;
import java.util.Scanner;
public class Pyramid1 {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the number of rows: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*OUTPUT:
enter the number of rows: 5
*
* *
* * *
* * * *
* * * * *
 */