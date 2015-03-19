package SquareBoard;

public class SquareBoardDemo {

	public static void main(String[] args) {
	
		iSquareBoard sb = new SquareBoard(7, "#");
		iSquareBoard cb = new CheckeredBoard(7, "#");
		
		sb.draw();
		System.out.println("");
		cb.draw();

	}

}
