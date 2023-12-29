
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		double random = Math.random();
		int countOfChildren = 0;
		if(random >= 0.5){
			while(random >= 0.5){
				System.out.print("b ");
				random = Math.random();
				countOfChildren++;
			}
			System.out.print("g ");
			System.out.println();
			countOfChildren++;
		}
		else{
			while(random < 0.5){
				System.out.print("g ");
				random = Math.random();
				countOfChildren++;
			}
			System.out.print("b ");
			System.out.println();
			countOfChildren++;
		}
		System.out.println("You made it... and you now have " + countOfChildren + " children.");
	}
}
