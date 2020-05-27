//a set of animals is printed using for each loop
package com.tgt.igniteplus;
import java.util.*;
public class ForEach {
    public static void main(String[] args){
        String[] animals = {"cow","lion","dog","cat"};
        System.out.println("The string animals contain:");
        for (String animal : animals){
            System.out.println(animal);
        }
    }
}
/*expected output
The string animals contain:
cow
lion
dog
cat
 */

