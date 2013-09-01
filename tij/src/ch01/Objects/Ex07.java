package ch01.Objects;

public class Ex07 {
	
	public static void main(String[] args) {
			
		System.out.println(Incrementable.n);
		Incrementable.increment();
		System.out.println(Incrementable.n);
		
	}
}

class Incrementable{
	static int n = 4;
	
	public static void increment(){
		n = n + 1;
	}
}
