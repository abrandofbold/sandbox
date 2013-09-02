package ch02.Operators;

import static util.Printing.*;

public class Ex03 {

	public static void main(String[] args) {
		
		Score s1 = new Score();
		
		s1.f = (float) 3.5;
		p(s1.f);
		
		alias(s1);
		p(s1.f);

	}
	
	static void alias(Score s){
		s.f = (float) 2.5;
	}
	

}