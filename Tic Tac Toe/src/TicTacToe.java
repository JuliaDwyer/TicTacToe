
public class TicTacToe
	{

		public static void main(String[] args)
			{
				//prepareBoard();
				displayBoard();

			}

	public static void displayBoard()
			{
				int[][] board = new int[3][3];
				System.out.println("    1    2    3");
				System.out.println("  -------------");
				System.out.println("A | "+ board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |  ");
				System.out.println("  -------------");
				System.out.println("B | "+ board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | ");
				System.out.println("  -------------");
				System.out.println("C | "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | ");
				System.out.println("  -------------");
				
				
			}

	public static void prepareBoard()
			{
				String fill = " ";
				for (int row = 0; row = 1; row )
					{
						for (int col = 0; col < board[0].length; )
							{
								String fill = board[row][col];
								
							}
					}
				
			}

		

	}
