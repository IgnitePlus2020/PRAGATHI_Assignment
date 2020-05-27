/*Develop a method that accepts a zip code and validates against non-deliverable zip codes.
• Example – zip codes 123, 456, 789 are non-deliverable.
• If the customer resides at a non-deliverable zip code, throw a custom exception.
• Handle the exception and display an appropriate message to the customer.
• If the customer resides at a deliverable zip code, display a message “Delivery available in your area! “.
• Invoke this method from the main function which takes the zip code as input parameter
 */
package com.tgt.igniteplus;
import java.util.*;
public class SwiggyCode {
    static   ArrayList<Integer> code = new ArrayList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the zipcode");
        int zipCode = sc.nextInt();
        code.add(123);
        code.add(456);
        code.add(789);
        try {
            checkCode(zipCode);
        } catch (Exception e) {
            System.out.println("Delivery unavailable");
        }
    }
    public static void checkCode(int zipCode) throws InvalideCodeException{
        int flag=0;
        for(int i =0;i< code.size();i++) {
            if (zipCode != code.get(i) &&  Integer.toString(zipCode).length()==6)
                flag=1;
            else
                throw new InvalideCodeException("Invalid");
        }
        if(flag==1)
            System.out.println("Delivery available in your area!");
    }
}
class InvalideCodeException extends Exception {
    InvalideCodeException(String s) {
        super(s);
    }
}
/*OUTPUT:
1.Enter the zipcode
560024
Delivery available in your area!

2.Enter the zipcode
345
Delivery unavailable
*/