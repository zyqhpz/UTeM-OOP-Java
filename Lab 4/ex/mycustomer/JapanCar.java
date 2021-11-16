package mycustomer;

public class JapanCar extends Car // a child of Car
{
	// JapanCar class variable
	private String name;

	// overrite Car()
	public JapanCar() {
		super();
	}

	// overrite Car(int tire, int door)
	public JapanCar(int tire, int door, String name) {
		super(tire, door);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setModel(String model) {
		super.model = model;
	}

}