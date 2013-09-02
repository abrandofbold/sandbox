package ch01.Objects;

import java.io.*;
import java.util.*;

public class Ex10 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		
		ArrayList<String> array = new ArrayList<String>();
		String line = " ";
		int i = 1;
		
		do {
			System.out.print("String "+i+": ");
			line = reader.readLine();
		
			if (line.length() != 0) {	
				array.add(new String(line)); 
			}
			
			i++;
		} while (line.length() != 0 && i <= 3);
		
		for (int n = 0; n < array.size(); n++){
			System.out.println(array.get(n));
		}

	}

}
