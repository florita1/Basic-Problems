package SumAndAverage;


public class SumAvgDemo {
	
	public static void main(String args[]) {
		iSumAndAverage reg = new SumAndAverage(1,10);		
		iSumAndAverage odd = new OddSumAvg(1,10);			
		iSumAndAverage even = new EvenSumAvg(1,10);
		
		checkSumAvg(reg);
		checkSumAvg(odd);
		checkSumAvg(even);
		
	}
	
	public static void checkSumAvg(iSumAndAverage sumAvg) {
		sumAvg.printMsg();
	}

}
