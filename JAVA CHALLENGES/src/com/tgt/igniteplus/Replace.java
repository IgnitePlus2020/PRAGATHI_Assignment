/* program to replace ‘a’ with ‘$’ in the following String
“I am always ready to learn although I do not always like being taught.” */
package com.tgt.igniteplus;
public class Replace {
    public static void main(String[] args){
        String str ="I am always ready to learn although I do not always like being taught";
        System.out.println("the initial string is :"+str);
        String s=str.replace('a','$');
        System.out.println("the replaced string is :"+s);
    }
}
/*OUTPUT:
the initial string is :I am always ready to learn although I do not always like being taught
the replaced string is :I $m $lw$ys re$dy to le$rn $lthough I do not $lw$ys like being t$ught
 */
