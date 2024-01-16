package com.rays.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class DataOutputStreamExample {
 
    public static void main(String[] s) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("E:\\IOFiles/item.txt"); //Open file “item” for write
        DataOutputStream dos = new DataOutputStream(fos);
        String itemName = "Laptop";
 
        dos.writeUTF(itemName);
        int quantity = 500;
        dos.writeInt(quantity);
        double price = 70000;
        dos.writeDouble(price);
        System.out.println("Record saved successfully");
        dos.close();
        fos.close();
    }
}