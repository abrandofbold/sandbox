package ch01.Objects;

public class Ex06 {
	
	public static void main(String[] args) {
		
		String s = "Hello Storage";
		System.out.println(storage(s));
		
	}
	
	public static int storage(String s){
		return s.length() * 2;
	}
	
}