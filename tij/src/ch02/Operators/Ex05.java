package ch02.Operators;

import static util.Printing.*;

public class Ex05 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Rufus","'Woof!'");
		Dog d2 = new Dog("Maxwell","'Grrr.'");
		
		p(d1+" and "+d2);

	}

}

class Dog{
	String name;
	String says;
	
	Dog(String name, String says){
		this.name = name;
		this.says = says;
	}
	
	public String toString(){
		return this.name + " says " + this.says;
	}
}
