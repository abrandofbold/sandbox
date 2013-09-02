package ch02.Operators;

import static util.Printing.*;

public class Ex06 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Rufus","'Woof!'");
		Dog d2 = new Dog("Maxwell","'Grrr.'");
		Dog d3 = d2;
		
		p(d1 == d2);
		p(d1 == d3);
		p(d2 == d3);

	}

}