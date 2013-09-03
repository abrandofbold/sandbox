package ch02.Operators;

import static util.Printing.*;

public class Ex10 {

	public static void main(String[] args) {
		int a = 474;
		int b = 711;
		
		p("  a: "+bin(a,12));
		p("  b: "+bin(b,12));
		
		p("and: "+bin(a & b,12));
		p(" or: "+bin(a | b,12));
		p("xor: "+bin(a ^ b,12));

	}
	
	public static String bin(int i,int digits){
		int z = digits - Integer.toBinaryString(i).length();
		String s = "";
		
		for (int n = 0; n<z; n++){
			s += 0;
		}
		
		s += Integer.toBinaryString(i);
		
		return s;
	}

}
