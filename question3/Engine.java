package question3;

public class Engine {
	
	private int rmp;
	private int Power;
	private String manufacturer;
	private Boolean hasTurbo;
	private Boolean turbo = false;
	
	public Engine() {
		
	}
	public Engine(int rmp,int Power, String manufacturer, Boolean hasTurbo) {
		this.rmp = rmp;
		this.Power = Power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	
	public void enableTurbo() {
		this.turbo = !(this.turbo);
	}
	
	public void setRmp(int val) {
		this.rmp = val;
	}
	public int getRmp() {
		return rmp;
	}
	
	public void setPower(int val) {
		this.Power = val;
	}
	public int getPower() {
		return Power;
	}
	
	public void setManufacturer(String val) {
		this.manufacturer = val;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setHasTurbo(Boolean val) {
		this.hasTurbo = val;
	}
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
}
