/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Fortesys
 */
public class BINARYBIODATA {
    public static void main(String[] args) {
            try {
           String name = "NAME: AHMAD FAUZI BIN AHMAD SOFI";
           String matrix = "MATRIX: 2014444074";
           String Gender = "GENDER: Male";
           String Age = "AGE: 26";
           String Email = "EMAIL: paskal889@gmail.com";
           String MobilePhone = "MOBILE PHONE: 019-5663029";
           String Student = "STUDENT: UITM SHAH ALAM";
           String filepath = "C:/Users/Fortesys/Desktop/AhmadFauzi(B).bin";
            byte[] NameBytes = name.getBytes();
            byte[] MatrixBytes = matrix.getBytes();
            byte[] GenderBytes = Gender.getBytes();
            byte[] AgeBytes = Age.getBytes();
            byte[] EmailBytes = Email.getBytes();
            byte[] MobilePhoneBytes = MobilePhone.getBytes();
            byte[] StudentBytes = Student.getBytes();
                try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(filepath))) {
                    write.write(NameBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                    write.write(MatrixBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                    write.write(GenderBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                    write.write(AgeBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                    write.write(EmailBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                    write.write(MobilePhoneBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                    write.write(StudentBytes);
                    write.write(System.getProperty("line.separator").getBytes());
                     //write.write(matrix);
                    
                    int totalLength = (NameBytes.length+MatrixBytes.length+GenderBytes.length+AgeBytes.length+EmailBytes.length
                            +MobilePhoneBytes.length+StudentBytes.length);
                    
                    System.out.println("Total Bytes Read : "+totalLength+" bytes");
                }

        } catch (IOException F) {
            System.err.println(F);
        }
            
    }
}
