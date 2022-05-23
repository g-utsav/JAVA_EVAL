package question3;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("Harrier", "Tata", "black", 10000, 110, "tata", true);
		
		System.out.println("Car Model : "+c1.getModel());
		System.out.println("Car companyName : "+c1.getCompanyName());
		System.out.println("Car color : "+c1.getColor());
		System.out.println("Car RPM : "+c1.getEngine().getRmp());
		System.out.println("Car power : "+c1.getEngine().getPower());
		System.out.println("Car Engine Manufacture : "+c1.getEngine().getManufacturer());
		System.out.println("Car Has Turbo : "+c1.getEngine().getHasTurbo());
		
		c1.getEngine().enableTurbo();

	}

}
