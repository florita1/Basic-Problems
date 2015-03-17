package TimeTable;

public enum EnumTimeTable {
	    addition ("+") {
	    	public void compute(String value) {
		    	int[][] tt = new int[9][9];
				
				for (int i = 1; i <= 9; i++) {
			         for (int j = 1; j <= 9; j++) {
			        	tt[i-1][j-1] = i+j;
			            System.out.printf("%3d ", tt[i-1][j-1]);
			         }
			         System.out.println();
			      }
			
			}
	    },
	    subtraction ("-") {
	    	public void compute(String value) {
		    	int[][] tt = new int[9][9];
				
				for (int i = 1; i <= 9; i++) {
			         for (int j = 1; j <= 9; j++) {
			        	tt[i-1][j-1] = i-j;
			            System.out.printf("%3d ", tt[i-1][j-1]);
			         }
			         System.out.println();
			      }
			
			}
	    },
	    multiplication ("*") {
	    	public void compute(String value) {
		    	int[][] tt = new int[9][9];
				
				for (int i = 1; i <= 9; i++) {
			         for (int j = 1; j <= 9; j++) {
			        	tt[i-1][j-1] = i*j;
			            System.out.printf("%3d ", tt[i-1][j-1]);
			         }
			         System.out.println();
			      }
			
			}
	    },
	    division ("/") {
	    	public void compute(String value) {
		    	float[][] tt = new float[9][9];
				
				for (int i = 1; i <= 9; i++) {
			         for (int j = 1; j <= 9; j++) {
			        	tt[i-1][j-1] = (float) i/j;
			            System.out.printf("%.2f ", tt[i-1][j-1]);
			         }
			         System.out.println();
			      }
			
			}
	    };

	    private final String value;

	    private EnumTimeTable( String value) {
	        this.value = value;
	    }

	    public abstract void compute( String value);

	}
