package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List fruits;
	private Set cricketers;
	private Map cc;
	public void setFruits(List fruits){
	   this.fruits = fruits;
	}

	public void setCricketers(Set cricketers){
	   this.cricketers = cricketers;
	}
	public void setCc(Map cc) {
	   this.cc =cc;
	}
	public void printData()
	{
	   System.out.println("Fruits ................");
	   
	   for(Object fruit:fruits)
	   {
	     System.out.println(fruit); 
	   }
	   System.out.println("cricketers ................");
	    for(Object cricketer:cricketers)
	    {
	      System.out.println(cricketer); 
	    }

	   System.out.println("Country and capital");
	      Set keys = cc.keySet();
	      for(Object key:keys)
	      {
	        System.out.println("Country="+key+":capital"+cc.get(key));
	      }


	}

}
