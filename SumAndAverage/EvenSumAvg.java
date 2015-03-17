package SumAndAverage;


public class EvenSumAvg implements iSumAndAverage {

	public int lower;
	public int upper;
	public int sum;
	public float avg;
	public int evenNum;
	
	public EvenSumAvg ( int setLower, int setUpper) {
		lower = setLower;
		upper = setUpper;
		sum = getSum();
		avg = getAvg();
		evenNum = 0;
	}
	
	public int getSum() {
		int sum = 0;
		for( int x = lower; x <= upper; x++) {
			if(x % 2 != 0) {
				sum += x;
				evenNum += 1;
			}
		}
		
		return sum;
	}

	public float getAvg() {
		float avg = (float) sum/evenNum;
		return avg;
	}

	public void printMsg() {
		System.out.println("The sum of the even numbers is " + sum);		
		System.out.println("The average of the even numbers is "+ avg);
	}



}
