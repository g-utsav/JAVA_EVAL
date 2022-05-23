package question3;

public class Car {

	private String model;
	private String companyName;
	private String Color;
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine() {
		this.engine = new Engine();
	}
	public void setEngine( int rmp,int Power, String manufacturer, Boolean hasTurbo) {
		this.engine = new Engine(rmp,Power,manufacturer,hasTurbo);
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setCompanyName(String val) {
		this.companyName = val;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setColor(String val) {
		this.Color = val;
	}
	public String getColor() {
		return Color;
	}
	
	Car(){
		
	}
	
	Car(String model, String companyName, String Color, int rmp,int Power, String manufacturer, Boolean hasTurbo){
		this.model = model;
		this.companyName = companyName;
		this.Color = Color;
		this.engine = new Engine(rmp,Power,manufacturer,hasTurbo);
	}
	
	
}
