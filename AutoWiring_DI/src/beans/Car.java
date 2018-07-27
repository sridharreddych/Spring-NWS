package beans;

public class Car
{

	private Engine engine;
	//generate setter
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData()
	{
      System.out.println("EnginemodelYear:"+engine.getModelyear());
	 
	}
}
