/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Fortesys
 */
public class BINARYREADBIODATA {
     public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("C:/Users/Fortesys/Desktop/AhmadFauzi.bin");
            ObjectInputStream obj = new ObjectInputStream(in);
            int c;
            while ((c = obj.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException F) {
           System.err.println(F);
        }
    }
}
