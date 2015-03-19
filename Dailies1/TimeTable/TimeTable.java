package TimeTable;

public class TimeTable {
	
	private int n;
	
	public TimeTable(int startN) {
		setN(startN);
	}
	
	public void compute(String compType) {
		int[][] tt = new int[n][n];
		
		for (int i = 1; i <= n; i++) {
	         for (int j = 1; j <= n; j++) {
	        	tt[i-1][j-1] = i*j;
	            System.out.printf("%3d ", tt[i-1][j-1]);
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

}
