package CLW3;

public class CLW {

	public CLW() {
		int lineCount = 0;
		for(int x = 1; x <=110; x++) {
			lineCount += 1;
			if(x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
				System.out.print("CozaLozaWoza ");
				
			} else if(x % 3 == 0 && x % 5 == 0) {
				System.out.print("CozaLoza "); 

			} else if(x % 5 == 0) {
				System.out.print("Loza ");

			} else if(x % 3 == 0) {
				System.out.print("Coza ");

			} else if (x % 7 == 0) {
				System.out.print("Woza ");
			} else {

				System.out.print(x + " ");
			}

			if(lineCount == 11 ) {
				System.out.println("");
				lineCount = 0;
			}
		}

	}

}
