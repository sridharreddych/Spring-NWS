package beans;

public class Engine {

	private String modelyear;
	
	/*//instead of setter using paramterized constructor
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	*/
	/* for engine class we have one constructor */
	public Engine(String modelyear){
		this.modelyear=modelyear;
	}
	
	public String getModelyear() {
		return modelyear;
	}
	
}
