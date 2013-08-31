package util;

public class Printing {
	public static String pNL(int count) {
		String newLine = "";
		for(int i = 0; i < count; i++){
		newLine += System.getProperty("line.separator");
		}
		return newLine;
	}
	
	public static void printArray(int[] array){
		String arrayOutput = "";
		
		for (int i = 0; i < array.length; i++) {
			arrayOutput = arrayOutput + "[" + array[i] + "] ";
		}
		
		System.out.println(arrayOutput);
		
		return;
	}
	
	public static String reverse(String input, String output) {
        return (input.isEmpty()) ? output :
            (input.charAt(0) == ' ')
            ? output + ' ' + reverse(input.substring(1), "")
            : reverse(input.substring(1), input.charAt(0) + output);
    }
	
	public static String pCash(float value){
		return "$" + value + "0";
	}
	
	public static String pBrackets(String input){
		return "[" + input + "]";
	}
}
