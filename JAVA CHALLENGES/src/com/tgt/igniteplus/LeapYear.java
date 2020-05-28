// program to check if input year is leap year or not
package com.tgt.igniteplus;
import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        int year;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the year to be checked");
        year=in.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
            System.out.print(year+" is a leap year");
        else
            System.out.print(year+" is not a leap year");
    }
}
/*OUTPUT:
enter the year to be checked2000
2000 is a leap year

enter the year to be checked2002
2002 is not a leap year
 */