/*a program to print the following sequence
    1 2 3 4 5 ...
    1 2 3 4 ..
    1 2 3 ..
    1 2 ..
    1..
    ..
*/
package com.tgt.igniteplus;
import java.util.*;
public class NestedFor {
    public static void main(String[] args){
        int i,j,n;
        System.out.println("Enter the value of n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=n;i>=0;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
/*Sample output:
Enter the value of n
5
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1
 */