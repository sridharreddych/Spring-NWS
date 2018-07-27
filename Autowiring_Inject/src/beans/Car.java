package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car
{

	//autowiring by usin byName
	@Qualifier(value="e1")
	@Inject
	private Engine engine;

	
	
	public void printData()
	{
      System.out.println("EnginemodelYear:"+engine.getModelyear());
	 
	}
}
