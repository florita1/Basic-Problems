package PrintNumberInWord;


public class CasePrintNumber implements iPrintNumber {

	public String[] numNames = {"ONE","TWO","THREE","FOUR","FIVE","SIX",
			"SEVEN","EIGHT","NINE","OTHER"};	
	public String word;
	public int n;
	
	public CasePrintNumber(int setN) {
		n = setN;
		word = getWord();
	}

	public String getWord() {
		switch(n)
		{
		case 1 :
			word = numNames[0]; 
			return word;
		case 2 :
			word = numNames[1]; 
			return word;
		case 3 :
			word = numNames[2]; 
			return word;
		case 4 :
			word = numNames[3]; 
			return word;
		case 5 :
			word = numNames[4]; 
			return word;
		case 6 :
			word = numNames[5]; 
			return word;
		case 7 :
			word = numNames[6]; 
			return word;
		case 8 :
			word = numNames[7]; 
			return word;
		case 9 :
			word = numNames[8]; 
			return word;
		default :
			word = numNames[9];
			return word;
		}
	}
	
	public void printWord() {
		System.out.println(word);
	}

}
