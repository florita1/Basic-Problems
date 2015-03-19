package SumAndAverage;


public class OddSumAvg implements iSumAndAverage {

	public int lower;
	public int upper;
	public int sum;
	public float avg;
	public int oddNum;
	
	public OddSumAvg ( int setLower, int setUpper) {
		lower = setLower;
		upper = setUpper;
		sum = getSum();
		avg = getAvg();
		oddNum = 0;
	}
	
	public int getSum() {
		int sum = 0;
		for( int x = lower; x <= upper; x++) {
			if(x % 2 != 0) {
				sum += x;
				oddNum += 1;
			}
		}
		
		return sum;
	}

	public float getAvg() {
		float avg = (float) sum/oddNum;
		return avg;
	}

	public void printMsg() {
		System.out.println("The sum of the odd numbers is " + sum);		
		System.out.println("The average of the odd numbers is "+ avg);
	}

}
