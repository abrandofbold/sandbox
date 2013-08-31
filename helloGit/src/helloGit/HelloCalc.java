package helloGit;

import static util.Calculating.*;

public class HelloCalc {

	public static void main(String[] args) {
		int i = randInt(0, 10);
				
		System.out.println(i);
		
		for(int n = 0; n < i; n++){
			System.out.println((n+1)+": Hello.");
		}
		
	}

}
