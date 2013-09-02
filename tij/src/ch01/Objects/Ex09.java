package ch01.Objects;

public class Ex09 {

	public static void main(String[] args) {
		Boolean bo = new Boolean(true);
		Character c = new Character('x');
		Byte by = new Byte("7");
		Short s = new Short("17");
		Integer i = new Integer("717");
		Long l = new Long("7171");
		Float f = new Float("7.5");
		Double d = new Double("7.575");
		
		System.out.println(bo);
		System.out.println(c);
		System.out.println(by);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		boolean primBO = bo;
		char primC = c;
		byte primBY = by;
		short primS = s;
		int primI = i;
		long primL = l;
		float primF = f;
		double primD = d;
		
		System.out.println(primBO);
		System.out.println(primC);
		System.out.println(primBY);
		System.out.println(primS);
		System.out.println(primI);
		System.out.println(primL);
		System.out.println(primF);
		System.out.println(primD);
		
	}

}
