package exam.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	
	private C obj1;
	
	
	@Autowired
	public void setObj1(C obj1) {
		System.out.println("Service : repository DAO  wired to service ");
		this.obj1 = obj1;
	}




	public B()
	{
		
		//System.out.println("B object created");
	}




	
	//single select scenario
	public Mobile getMobile(int mn) {
		// note obj1 here is a repository object
		
		Optional<Mobile> x = obj1.findById(mn);
		Mobile y =null;
		if(x.isPresent())
		{
			 y = x.get();  //get the mobile object
			
		}
		else
		{
			y =new Mobile(mn,0);	
		}
		//logic is mobile object iemi no is zero then mobile no is not found.
		return y;
		
		
		
		
	}




	public Mobile updateMobile(Mobile n) {
		System.out.println("update failure");
		// TODO Auto-generated method stub
		if(obj1.existsById(n.getMn()))
				obj1.save(n); //change of failing is almost zero.
		else
				System.out.println("update failed");
		return n;
	}




	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return obj1.findAll();
	}

}
