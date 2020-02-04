package check;



public class HelloAspect {

	
	  public void freak()
	{
		System.out.println("security beginning before start of the function");
	}

	  public void aftersayHello() {
		    System.out.println("end security");
		  }
	  
	  public void afterreturnsayHello() {
	    System.out.println("Hello from Spring AOP after return!");
	  }
}
