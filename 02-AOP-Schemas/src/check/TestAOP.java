package check;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
      "applicationcontext.xml");

    
		
		/*
		 * HelloService lunch = (HelloService) context.getBean("helloService");
		 * service.test();
		 */
		 
    
		/*
		 * System.out.println(service.getClass().getName());
		 * 
		 * 
		 * HelloService1 service1 = (HelloService1) context.getBean("helloService1");
		 * 
		 */   
		
		  HelloService3 service3 = (HelloService3) context.getBean("helloService3");
		  System.out.println(service3.getClass().getName());
		  service3.display();
		 
   
 
  
  
  
  
  
  
  
    
  // service1.test2();
    
    
  }
}