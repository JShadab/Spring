
public class Test {

	public static void main(String[] args) {

		Car car = new Car();

		Engine engine = new Engine(); // Creating dependency
		car.setEngine(engine); // Setter injection
		
		car.start();
		
//		OR
		
		Car car2 = new Car(engine);// Constructor injection
		car2.start();

		
	}

}
