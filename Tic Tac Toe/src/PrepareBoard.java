
public interface PrepareBoard
	{
		DisplayBoard.board;
		String fill = " ";
		// for (int row = 0; row = 1; )
		// {
		// for (int col = 0; col < DisplayBoard.board.length; )
		// {
		// DisplayBoard.board[row][col] = fill;

		// }
		for(
		int row = 0;row<DisplayBoard.board.length;row++)
			{
				for (int col = 0; col < DisplayBoard.board.length[0].length; col++)
					{
						DisplayBoard.board.length[row][col] = fill;

					}
			}
	}

}
