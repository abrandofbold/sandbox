package ch02.Operators;

import java.util.*;
import static util.Printing.*;

public class Ex07 {

	public static void main(String[] args) {
		
		p(flip());
		p(flip());
		p(flip());
		p(flip());

	}
	
	static String flip(){
		Random r = new Random();
		String s;
		
		int i = r.nextInt(2);
		
		if(i == 1){
			s = "Heads";
		}else{
			s = "Tails";
		}
	
		return s;
	}

}
