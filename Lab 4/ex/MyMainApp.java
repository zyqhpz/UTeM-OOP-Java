import mycustomer.JapanCar;
import mycustomer.MalaysianCar;

public class MyMainApp {
	public static void main(String[] args) {
		JapanCar toyota = new JapanCar();
		// setModel is a method in Car.
		toyota.setModel("Vios");

		// getModel is a method in Car
		String toyotaModel = toyota.getModel();
		System.out.println("The model is :" + toyotaModel);

		// example part 3
		MalaysianCar myCar = new MalaysianCar(4, 4, "Saga", "Red", 40000);

		// call overriding method
		myCar.setPrice(50000);

		// call parent's method
		double price = myCar.getPrice();
		String model = myCar.getModel();
		// call MalaysianCar's method
		String color = myCar.getColor();

		System.out.println("MOdel : " + model + ", color : " + color + ", price :" + price);

	}
}

/*
 * //example part 1 JapanCar toyota = new JapanCar();
 * toyota.setPrice(100000.00); double price = toyota.getPrice();
 * 
 * System.out.println("The price is : "+price);
 * 
 * //example part 2 JapanCar nissan = new JapanCar(4, 2, "Skyline"); //invoke
 * method in JapanCar System.out.println("The car name is : "+nissan.getName());
 * //invoke method in Car / parent class
 * 
 * int tire = nissan.getTire(); int door = nissan.getDoor();
 * 
 * System.out.println("Name : "+nissan.getName()+", tire : "+tire+", door : "
 * +door);
 * 
 */