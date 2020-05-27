//to check if an individual is eligible to vote by taking age as an input.If age is less than 18 not eligible otherwise eligible
package com.tgt.igniteplus;
import java.util.*;
public class SimpleIf {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age of the individual : ");
        age = in.nextInt();
        if (age < 18) {
            System.out.println("The individual is not allowed to vote");
            return;
        }
        System.out.print("The individual is allowed to vote");
    }
}
/*expected output
1.Enter the age of the individual : 19
  The individual is allowed to vote
2.Enter the age of the individual : 10
  The individual is not allowed to vote
 */