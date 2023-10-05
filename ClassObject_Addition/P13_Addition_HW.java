package P_ClassObject_Addition;

public class P13_Addition_HW {

	/*/ Task: you should create a Method (WeekendOrWeekday) 
	which will receive one parameter(day). If the day is Saturday Or Sunday, 
	it will print Weekend Otherwise weekdays. You must need to  use
	object for accessing method /*/ 
	
	
	void WeekendOrWeekday (String day) {
		if ((day == "Saturday") || (day == "Sunday")) {
			System.out.println("This is a Weekend") ;
		}
		else if ((day == "Monday" )|| (day == "Tuesday")
				||(day == "Wednesday") ||(day== "Thursday" )
				||(day =="Friday")) { 
		
		System.out.println("This is a Weekday");
		}
		else {
			System.out.println("User input is Undefined");
		}

	}
	public static void main(String[] args) {
		P13_Addition_HW obj = new P13_Addition_HW();
		obj.WeekendOrWeekday("Hi");
	}
	
}
	

