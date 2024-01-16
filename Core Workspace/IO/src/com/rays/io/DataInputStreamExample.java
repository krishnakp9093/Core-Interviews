package com.rays.io;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
 
public class DataInputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("E:\\IOFiles/item.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("Item Details are");
        System.out.println("Item Name " + dis.readUTF());
        System.out.println("quantity " + dis.readInt());
        System.out.println("price " + dis.readDouble());
 
        dis.close();
        fis.close();
    }
}
