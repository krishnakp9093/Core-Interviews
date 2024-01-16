package com.rays.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternal {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	 	StudentExternal st = new StudentExternal(1, "Ram");
	   
	 	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("  "));
        out.writeObject(st);
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(""));
        st =(StudentExternal)in.readObject();
	
	    
	}

}
