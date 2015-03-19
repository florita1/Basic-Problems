package PrintNumberInWord;


public class PrintNumberDemo {

	
	public static void main(String[] args) {
		iPrintNumber num1 = new CasePrintNumber(6);
		num1.printWord();
		
		iPrintNumber num2 = new IfPrintNumber(7);
		num2.printWord();
		
		for(NumWord value : NumWord.values()) {
			if(value.getWord() == 7){
				System.out.println(value);
			}
		}
			
	}

}
