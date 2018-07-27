package beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component
@Named
public class Car {

	@Resource
	private Engine engine;
	
	public void printEng()
	{
		
		System.out.println("Engine Name="+engine.getEngname());
	}
}
