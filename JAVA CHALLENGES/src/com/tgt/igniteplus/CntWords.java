// program to count the number words in a string
package com.tgt.igniteplus;
import java.util.*;
public class CntWords {
    public static void main(String[] args){
        String s;
        System.out.print("enter the string:");
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        if(s==null||s.isEmpty())
            System.out.print("empty string");
        else{
            String[] words=s.split("\\s+");
            System.out.print("the number of words in "+s+" is "+words.length);
        }
    }
}
/*OUTPUT:
enter the string:An amazing day
the number of words in An amazing day is 3
 */