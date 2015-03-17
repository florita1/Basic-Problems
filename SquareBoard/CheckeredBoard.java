package SquareBoard;

public class CheckeredBoard implements iSquareBoard {

	private int n;
	private String drawChar;

	public CheckeredBoard(int startN, String startDrawChar) {
		setN(startN);
		setDrawChar(startDrawChar);
	}

	public void draw() {
		String[][] drawSet = new String[n][n];
		for(int i = 0; i <= n-1; i++) {
			if(i % 2 != 0) {
				System.out.print(" ");
			}
			for(int j = 0; j <= n-1; j++) {
				drawSet[i][j] = drawChar;
				System.out.printf("%1s ", drawSet[i][j]);
			}
			System.out.println();
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getDrawChar() {
		return drawChar;
	}

	public void setDrawChar(String drawChar) {
		this.drawChar = drawChar;
	}

}
