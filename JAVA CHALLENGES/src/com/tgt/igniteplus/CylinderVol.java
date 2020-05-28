//program to calculate the volume of a cylinder
package com.tgt.igniteplus;
import java.util.*;
public class CylinderVol {
    public static void main(String[] args){
        float r,h;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of radius and height of the cylinder");
        r=in.nextFloat();
        h=in.nextFloat();
        float vol = (float)((22*r*r*h)/7);
        System.out.print("volume of the cylinder is "+vol);
    }
}
/*OUTPUT:
enter the value of radius and height of the cylinder10 20
volume of the cylinder is 6285.7144
 */