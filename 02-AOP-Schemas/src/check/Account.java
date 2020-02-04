package check;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Account {

	String beanName;
	ApplicationContext ctx;
	
	float amt;

	
	
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
		System.out.println("lifecycle 2.. DI");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("lifecycle 6.. @Postconstruct");
	}
	
	@PreDestroy
	public void close()
	{
		System.out.println("destruction lifecycle 1.. @PreDestory");
	}
	
	
	public void bal()
	{
		//System.out.println("logging service logic"); //service logic
		System.out.println("Balance amount is :" + amt); //business logic
		//System.out.println("profyling service logic"); //service logic
	}
	public void setBeanName(String arg0) {
		beanName = arg0;
		System.out.println("lifecycle 3..bean name aware");
	}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		ctx = arg0;
		System.out.println("lifecycle 4..application context aware");
	
	}

	public void begin()
	{
		System.out.println("lifecycle 8..custom method");
			
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("lifecycle 7..Initializing bean");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destruction lifecycle 2.. DisposableBean");
	}
	
	
	public void end()
	{
		System.out.println("destruction lifecycle 3.. custom destroy");
}
}