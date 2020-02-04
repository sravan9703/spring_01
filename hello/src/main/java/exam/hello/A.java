package exam.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "*")
@RestController
public class A {
	
	private B obj1;
	
	public A()
	{
		////System.out.println("A object created");
		
	}
	
	
	@Autowired
	public void setObj1(B obj1) {
		System.out.println("Controller : service is wired with Controller ");
		this.obj1 = obj1;
	}


//http:localhost:8080?x=1
	
	//http://localhost:8080/pw?x=1
	
	//http://localhost:8080/pw?x=10, you will get mobile no as zero
	
	@GetMapping("/pw")
	public Mobile f1(@RequestParam("x")int mn)//assume single select
	{
		System.out.println("function pw is getting called");
		Mobile m =obj1.getMobile(mn);
		return m;
		
	}
	
	
	@PostMapping("/upd")
	public Mobile f2(@RequestBody Mobile n)//assume single select
	{
		RestTemplate x=new RestTemplate();
		
		Mobile m =obj1.updateMobile(n);
		return m;
		
	}
	
	@GetMapping("/ms") //multiselect
	public List<Mobile> get()
	{
		List<Mobile> x =obj1.getAll();
		return x;
		
	}
	
	@GetMapping("/sbs")
	public Item whocares(@RequestParam("x") int itemno)
	{
		System.out.println("please work");
		Item x =new Item();
		x.setItemname("abc");
		x.setItemno(23);
		x.setPrice(44);
		return x;
		
	}
	
	
	
	
	
	

}
