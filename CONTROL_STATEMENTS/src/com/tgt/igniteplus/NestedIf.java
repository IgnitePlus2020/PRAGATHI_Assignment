//to check if the marks entered is distinction or not,failed or not
package com.tgt.igniteplus;
import java.util.*;
public class NestedIf {
    public static void main(String[] args){
        int marks;
        System.out.print("enter the marks ");
        Scanner in=new Scanner(System.in);
        marks=in.nextInt();
        if(marks>35){
            if(marks>75) {
                System.out.print("DISTINCTION");
                return;
            }
            System.out.print("NOT DISTINCTION");
            return;
        }
        System.out.print("FAIL");
    }
}
/*Sample output:
1.enter the marks 40
  NOT DISTINCTION
2.enter the marks 20
  FAIL
3.enter the marks 80
  DISTINCTION
 */