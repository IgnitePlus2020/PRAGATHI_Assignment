//to find the largest of 2 numbers
package com.tgt.igniteplus;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        int num1 , num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 2 numbers : ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        if(num1<num2)
            System.out.println(num2+"is greater than "+num1);
        else
            System.out.println(num1+" is greater than "+num2);
    }
}
/*sample output:
1.Enter the 2 numbers : 10 20
  20 is greater than 10
2.Enter the 2 numbers : 100 20
  100 is greater than 20
 */