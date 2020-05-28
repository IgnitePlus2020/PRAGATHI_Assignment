//program to copy data from one file to another.Note:first create a file named InputFile.txt with some contents in it
package com.tgt.igniteplus;
import java.io.*;
public class CopyFile {
    public static void main(String[] args)
    {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        try{
            File infile =new File("InputFile.txt");
            File outfile =new File("OutputFile.txt");
            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }
            instream.close();
            outstream.close();
            System.out.println("File copied successfully!!");
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
/*OUTPUT:
File copied successfully!!
 */