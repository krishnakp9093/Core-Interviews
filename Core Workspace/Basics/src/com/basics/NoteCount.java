package com.basics;

public class NoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] notes = {2000,500,200,100,50,20,10,5,2,1};
		
		int money = 4321;
		
		int count;
		for (int i = 0; i < notes.length; i++) {
			
			count = money/notes[i];
			
			if(count>0) {
				System.out.println(notes[i]+ " = "+count);
                money = money%notes[i];
              //  System.out.println(money);
			}
		}
		

	}

}
