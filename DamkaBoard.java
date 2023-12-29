/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= num; col++){
				if(row % 2 == 0){
					System.out.print(" *");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}