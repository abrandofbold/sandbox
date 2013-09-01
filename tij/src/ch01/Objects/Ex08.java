package ch01.Objects;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Incrementable i1 = new Incrementable();
		Incrementable i2 = new Incrementable();
		
		System.out.println(i1.n);
		System.out.println(i2.n);

		i1.increment();
		
		System.out.println(i1.n);
		System.out.println(i2.n);
		
	}
}
