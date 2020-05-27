// a program that implements linear search algorithm
package com.tgt.igniteplus;
import java.util.*;
public class LinSearch {
    public static void main(String[] args) {
        int n,i,key;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of elements");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.print("enter the elements in any order");
        for (i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.print("enter the key/search element");
        key = in.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==key){
                System.out.print("the key/search element is found at "+(i+1));
                break;
            }
        }
        if(i==n){
            System.out.print("the key/search element is not found");
        }
    }
}
/*OUTPUT:
enter the number of elements5
enter the elements in any order10 5 8 70 90
enter the key/search element8
the key/search element is found at 3
 */
