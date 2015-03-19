package TimeTable;

public class TimeTableDemo {

	public static void main(String[] args) {
		TimeTable t1 = new TimeTable(9);
		t1.compute("Multiplication");
		
		System.out.println("");
		
		EnumTimeTable t2 = EnumTimeTable.division;
		t2.compute("division");;
	}

}
