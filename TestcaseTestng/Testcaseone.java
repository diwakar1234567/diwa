package TestcaseTestng;

import org.testng.annotations.Test;

public class Testcaseone {
	@Test(priority = 1)
	void open(){
		System.out.println("Opened app");
		
	}
	@Test(priority = 2)
   void Login(){
	   System.out.println("Login app");
	}
	@Test(priority = 3)
   void Logout(){
		System.out.println("Logout app");
	}	
}
