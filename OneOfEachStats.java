import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		boolean girl = false;
		boolean boy = false;
		int numOf2Children = 0;
		int numOf3Children = 0;
		int numOf4Children = 0;
		int countOfChildren = 0;
		double countTotal = 0;
		for(int i = 0; i < T; i++){
			while((girl != true) || (boy != true)){
				if(generator.nextDouble() < 0.5){
					countOfChildren++;
					girl = true;
				}
				else{
					countOfChildren++;
					boy = true;
				}
			}
			countTotal += countOfChildren;
			if(countOfChildren == 2){
				numOf2Children++;
			}
			if(countOfChildren == 3){
				numOf3Children++;
			}
			if(countOfChildren >= 4){
				numOf4Children++;
			}
			girl = false;
			boy = false;
			countOfChildren = 0;
		}
		System.out.println("Average: " + (countTotal / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + numOf2Children);
		System.out.println("Number of families with 3 children: " + numOf3Children);
		System.out.println("Number of families with 4 or more children: " + numOf4Children);
		if(numOf2Children >= numOf3Children){
			if(numOf2Children >= numOf4Children){
				System.out.println("The most common number of children is 2.");
			}
			else{
				System.out.println("The most common number of children is 4 or more.");
			}
		}
		else{
			if(numOf3Children >= numOf4Children){
				System.out.println("The most common number of children is 3.");
			}
			else{
				System.out.println("The most common number of children is 4 or more.");
			}
		}
		
	}
}
	