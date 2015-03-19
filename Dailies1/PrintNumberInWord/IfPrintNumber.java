package PrintNumberInWord;


public class IfPrintNumber implements iPrintNumber {

	public String[] numNames = {"ONE","TWO","THREE","FOUR","FIVE","SIX",
			"SEVEN","EIGHT","NINE","OTHER"};	
	public String word;
	public int n;
	
	public IfPrintNumber(int setN) {
		n = setN;
		word = getWord();
	}

	public String getWord() {
		if(n == 1){
			word = numNames[0]; 
			return word;
		} else if(n == 2) {
			word = numNames[1]; 
			return word;
		} else if(n == 3) {
			word = numNames[2]; 
			return word;
		} else if(n == 4) {
			word = numNames[3]; 
			return word;
		} else if(n == 5) {
			word = numNames[4]; 
			return word;
		} else if(n == 6) {
			word = numNames[5]; 
			return word;
		} else if(n == 7) {
			word = numNames[6]; 
			return word;
		} else if(n == 8) {
			word = numNames[7]; 
			return word;
		} else if(n == 9) {
			word = numNames[8]; 
			return word;
		} else {
			word = numNames[9];
			return word;
		}
	}
	
	public void printWord() {
		System.out.println(word);
	}

}
