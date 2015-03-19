package checkOddEven1;

public class CheckOddEven {

	private int number;

	public int getNumber() {
		return number;
	}

	public CheckOddEven(int setNumber) {
		number = setNumber;
		String message = "";

		if(number % 2 == 0) {
			message = "Even number";
		} else {
			message = "Odd number";
		}

		System.out.println(message);
	}

}
