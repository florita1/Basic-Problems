package product1ToN2;

public class Product1ToN {
	
	public Product1ToN(int setLower, int setUpper) {
		int lower = setLower;
		int upper = setUpper;
		long product = 1;
		
		for( int x = lower; x <= upper; x++) {
			product *= x;
		}
		
		System.out.println(product);
	}

}
