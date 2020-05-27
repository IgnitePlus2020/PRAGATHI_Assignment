// a program to print largest and second largest number out of the 3 numbers
package com.tgt.igniteplus;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        int a,b,c;
        System.out.print("enter the 3 numbers: ");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println("largest:"+a);
            if(b<c)System.out.print("Second largest:"+c);
            else System.out.print("Second largest:"+b);
        }
        else if(b>a && b>c){
            System.out.println("largest:"+b);
            if(a<c)System.out.print("Second largest:"+c);
            else System.out.print("Second largest:"+a);
            }
        else{
            System.out.println("largest:"+c);
            if(b<a)System.out.print("Second largest:"+a);
            else System.out.print("Second largest:"+b);
        }

    }
}
/*OUTPUT:
enter the 3 numbers: 10 20 30
largest:30
Second largest:20
 */