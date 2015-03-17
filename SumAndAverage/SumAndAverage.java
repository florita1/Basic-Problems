package SumAndAverage;



public class SumAndAverage implements iSumAndAverage {
	
	public int lower;
	public int upper;
	public int sum;
	public float avg;
	
	public SumAndAverage( int setLower, int setUpper) {
		lower = setLower;
		upper = setUpper;
		sum = getSum();
		avg = getAvg();
	}
	
	public int getSum() {
		int sum = 0;
		for( int x = lower; x <= upper; x++) {
			sum += x;
		}
		
		return sum;
	}

	public float getAvg() {
		float avg = (float) sum/((upper-lower)+1);
		return avg;
	}

	public void printMsg() {
		System.out.println("The sum is " + sum);		
		System.out.println("The average is "+ avg);
	}
	
}