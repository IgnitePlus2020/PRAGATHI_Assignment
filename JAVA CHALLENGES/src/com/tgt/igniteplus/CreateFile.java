//program to create a java file
package com.tgt.igniteplus;
import java.io.*;
public class CreateFile {
    public static void main(String[] args) throws IOException {
        try {
            File f=new File("example.txt");
            if(f.createNewFile())
                System.out.println("File has been created ");
            else
                System.out.println("File already exists");
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}
/*OUTPUT:
File already exists
 */