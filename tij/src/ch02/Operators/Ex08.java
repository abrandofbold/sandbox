package ch02.Operators;

import static util.Printing.*;

public class Ex08 {

	public static void main(String[] args) {
		Long l1 = new Long(0x2f);
		Long l2 = new Long(0177);
		
		p(Long.toBinaryString(l1));
		p(Long.toBinaryString(l2));

	}

}
