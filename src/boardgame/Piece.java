package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Apenas para fins didaticos, 
						//uma vez que para essa situação o java faz a atribuição implicitamente
	}

	protected Board getBoard() {
		return board;
	}

	
}
