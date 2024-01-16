package com.rays.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentExternal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//Serialize.......
		StudentExternal s = new StudentExternal(1, "Krishhna");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E://IOFiles//Deserialize.txt"));
		out.writeObject(s);
		
		
		//Deserialize........
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://IOFiles//Deserialize.txt"));
		s =(StudentExternal)in.readObject(); 
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		out.close();
		in.close();
	}

}
