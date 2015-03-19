package PrintNumberInWord;


public enum NumWord { 
	ONE (1),
	TWO (2),
	THREE (3),
	FOUR (4),
	FIVE (5),
	SIX (6),
	SEVEN (7),
	EIGHT (8),
	NINE (9),
	OTHER (10);

	private int value;

	private NumWord(int setValue) {
		this.value = setValue;
	}
	public int getWord() {
		return value;
	}

}