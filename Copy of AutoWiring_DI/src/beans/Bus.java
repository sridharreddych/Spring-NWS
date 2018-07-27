package beans;

public class Bus {
	private Engine engine;

	/*added bus default constructor and setEngine method */
	/*public Bus() {
		System.out.println("default Bus constructor");
		// TODO Auto-generated constructor stub
	} */
	public void setEngine(Engine engine) {
		System.out.println(" Engine setter method");
		this.engine = engine;
	} 
	public Bus(Engine engine)
	{
		System.out.println("parameterized Bus constructor");
		this.engine=engine;
	}

	public void printData()
	{
		System.out.println("Bus Eng ModelYear:="+engine.getModelyear() );
	}

}
