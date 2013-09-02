package ch02.Operators;

import static util.Printing.*;

public class Ex02 {

	public static void main(String[] args) {
		
		Score s1 = new Score();
		Score s2 = new Score();
		
		s1.f = (float) 3.5;
		s2.f = (float) 4;
		p(s1.f+" "+s2.f);
		
		s1.f = s2.f;
		s2.f = (float) 5.5;
		p(s1.f+" "+s2.f);
		
		s1 = s2;
		s2.f = (float) 7.0;
		p(s1.f+" "+s2.f);	

	}

}

class Score {
	float f;
}