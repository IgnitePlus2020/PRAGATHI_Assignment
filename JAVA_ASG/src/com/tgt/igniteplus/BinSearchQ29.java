// a program that implements binary search algorithm(elements must be in sorted order)
package com.tgt.igniteplus;
import java.util.*;
public class BinSearchQ29 {
    public static void main(String[] args){
        int n,key;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of elements");
        n=in.nextInt();
        int[] a=new int[n];
        System.out.print("enter the elements in sorted order");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print("enter the key/search element");
        key=in.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==a[mid]){
                System.out.print("the key/search element is found at "+(mid+1));
                break;
            }
            else if(key<a[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        if(low>high)
            System.out.print("the key/search element is not found");
    }
}
/*OUTPUT:
enter the number of elements5
enter the elements in sorted order10 20 30 40 50
enter the key/search element30
the key/search element is found at 3
 */
