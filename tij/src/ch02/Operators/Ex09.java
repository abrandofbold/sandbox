package ch02.Operators;

import static util.Printing.*;

public class Ex09 {

	public static void main(String[] args) {
		double dMin = 1e-323d;
		double dMax = 1e308d;
		float fMin = 1e-45f;
		float fMax = 1e38f;
		
		p(dMin);
		p(dMax);
		p(fMin);
		p(fMax);

	}

}
