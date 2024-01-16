package com.rays.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		StudentSerialisation st = new StudentSerialisation(10,"Raj");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(""));
		out.writeObject(st);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(" "));
		st=(StudentSerialisation)in.readObject();
		System.out.println(st.getId());
		System.out.println(st.getName());

	}

}
