
public class TicTacToe
	{

		public static void main(String[] args)
			{
				int[][] board = new int[3][3];
				prepareBoard();
				displayBoard();

			}

		private static void prepareBoard()
			{
				
				
			}

		private static void displayBoard()
			{
				System.out.println("  1    2    3");
				System.out.println("  -------------");
				System.out.println("A |"+ board[0][0]="|"+board[0][1]+"|"|");
				System.out.println("  -------------");
				System.out.println("B |   |   |   |");
				System.out.println("  -------------");
				System.out.println("C |   |   |   |");
				System.out.println("  -------------");
				
				
			}

	}
