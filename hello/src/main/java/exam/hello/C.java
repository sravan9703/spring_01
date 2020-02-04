package exam.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C extends JpaRepository<Mobile, Integer> {
	
	//Mobile is entity class, Integer is primary key
	// hibernate will never work until you use concept called Primary key.
	
	//@Query("SELECT u FROM Mobile u WHERE u.imeino = 3")
	//Collection<Mobile> findAllActiveUsers();
	
	/*
	 
	  //you dont need to write this if you got something else please go ahead and use it.
	  
	  //import delete should work and how it works it is left to you.
	  @Modifying
    @Query("delete from User u where u.firstName = ?1")
    void deleteUsersByFirstName(String firstName);

	  
	  
	 */
	

}
