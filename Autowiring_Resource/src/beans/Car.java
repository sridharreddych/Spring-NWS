package beans;

import javax.annotation.Resource;

public class Car
{

	//autowiring by usin byName
	@Resource
	private Engine engine;

	
	
	public void printData()
	{
      System.out.println("EnginemodelYear:"+engine.getModelyear());
	 
	}
}
