/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int middle = s.length() / 2;
		char midChar;
		if(s.length() % 2 == 0){
			midChar = s.charAt(middle-1);
		}
		else {
			midChar = s.charAt(middle);
		}
		for(int i = s.length() - 1; i >= 0 ; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is " + midChar);
	}
}
