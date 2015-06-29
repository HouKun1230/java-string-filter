package String_filter;

import java.util.Scanner;
import java.io.*;

public class StringFilter {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		while(true){
		System.out.println("Please enter the string:");
		Scanner s = new Scanner(System.in);
		String input = "";
		String drop = "";
		String output = "";
		int counter = 0;
//		while(s.hasNextLine())
//		{
			input += s.nextLine();
		//}
		
		System.out.println("Please enter the string you want filtered:");
		Scanner drop_string = new Scanner(System.in);
//		while(drop_string.hasNextLine())
//		{
			drop += drop_string.nextLine();
		//}
		
//		System.out.println(input.length());
//		System.out.println(drop);
		char temp[] = new char[drop.length()];	
		for(int i = 0;i<drop.length();i++){
			temp[i] = drop.charAt(i);
		}
		char str[] = new char[input.length()];
		for(int i = 0; i<input.length();i++){
				
			str[i] = input.charAt(i);
		}
		
		for(int i = 0;i<(input.length()-drop.length());i++){
			for(int j = 0;j<drop.length();j++){
				if(str[i+j] == temp[j]){
					counter++;
				}
			}
	
		}
		if(counter == drop.length()){
			System.out.println("Found one match");
		}else{
			System.out.println("Nothing found");
		}
			
	}
	}

}
