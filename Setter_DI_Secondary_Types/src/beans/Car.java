package beans;

public class Car {
	private String carname;
	private Engine engine;
	
	public Car() {
		System.out.println("CAR");
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	 public void printCarData()
	 {
		 System.out.println("carname="+carname);
		 System.out.println("modelyear="+engine.getModelyear());
	 }
}
