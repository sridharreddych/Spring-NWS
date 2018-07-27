package beans;
public class Car
{

   private String[] carnames;
   private Engine[] engine;
       //generate setters and getters
   public void setCarnames(String[] carnames) {
	this.carnames = carnames;
   }
   
   public void setEngine(Engine[] engine) {
	this.engine = engine;
}
   
   public void printCarData()
   {
    for(String car:carnames){
      System.out.println(car); 
    }
    for(Engine e:engine)
    {
      System.out.println(e.getModelyear());
    }


   }
   
}
