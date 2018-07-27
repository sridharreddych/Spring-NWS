package beans;

 public class CarFactory {
	public  String carname;
	
	
	public  void setCarname(String carname) {
		this.carname = carname;
	}
	
	
	//static factory approach
	public Car getInstance() throws Exception 
	{
	
		Car c=(Car)Class.forName(carname).newInstance();
	    return c;
	}

}
