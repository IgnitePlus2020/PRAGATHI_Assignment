/*A pen costs 50$ and it is been sold at a discount of 12%(0.12), Write a program to display discount
amount and selling price of the pen */
package com.tgt.igniteplus;
public class Discount {
    public static void main(String[] args){
        float cost_price=50;
        float discount=(float)0.12;
        float discount_amount = (discount * cost_price);
        float selling_price=cost_price-discount_amount;
        System.out.println("the discount amount on the pen is "+discount_amount);
        System.out.println("the selling price of the pen is "+selling_price);
    }
}
/*OUTPUT:
the discount amount on the pen is 6.0
the selling price of the pen is 44.0
 */