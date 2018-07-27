package beans;

 public class CarFactory {
	public static String carname;
	
	
	public static void setCarname(String carname) {
		CarFactory.carname = carname;
	}
	
	
	//static factory approach
	public static Car getInstance() throws Exception 
	{
	
		Car c=(Car)Class.forName(carname).newInstance();
	    return c;
	}

}
