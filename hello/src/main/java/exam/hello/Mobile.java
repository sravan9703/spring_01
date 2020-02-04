package exam.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	
	@Id
	private int mn;
	private int imeino;
	public int getMn() {
		
		
		return mn;
	}
	public void setMn(int mn) {
		this.mn = mn;
	}
	public int getImeino() {
		return imeino;
	}
	public void setImeino(int imeino) {
		this.imeino = imeino;
	}
	public Mobile(int mn, int imeino) {
		
		this.mn = mn;
		this.imeino = imeino;
	}
	public Mobile() {
	
		// TODO Auto-generated constructor stub
	}
	
	

}
