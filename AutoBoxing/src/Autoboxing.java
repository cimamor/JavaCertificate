
public class Autoboxing {
	public static void main(String... strings) {
		checkValueAutoBoxing(3);
		checkValueAutoBoxing(300);		
	}
	
	
	private static void checkValueAutoBoxing(int value){
		System.out.println("********** VALOR = '"+ value +"' **************");
		Integer integer1 = value;
		Integer integer2 = integer1;
		integer1 = 5;
		
		if (integer1 == integer2)
			System.out.println("integer1 == integer2");
		else
			System.out.println("integer1 != integer2");

		isEquals(integer1, integer2);
	}
	
	
	private static void isEquals(int number1, int number2){
		if(number1 == number2){
			System.out.println("number1 == number2");
		}
		else{
			System.out.println("number1 != number2");
		}
	}
}