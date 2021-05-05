import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
*/
public class TestMyJUnit {
	
	@Test
	public void testWelcome1() {
		String welcomeMessage = "Welcome to JUnit";
		GreetMessenger greetmsg = new GreetMessenger("Welcome to JUnit");
		assertEquals("Welcome to JUnit", greetmsg.getGreeting());
		

	}

	@Test
	public void testWelcome2() {
		String welcomeMessage = "Welcome to JUnit";
		assertEquals("Welcome to jUnit", welcomeMessage);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void Bank() {
		SavingsAccount sa = new SavingsAccount(15000);
		assertEquals(69980, sa.getBalance());
	}

	@Test
	public void testSomeAssertions() {
		int empno = 7839;
		String empName = "Ashish";
		String empJob = "Manager";

		assertEquals("Manager", empJob);
		System.out.println("EmpJob has passed....");
		System.out.println("Adding lines");
		System.out.println("To check in github");
		assertFalse(empno < 1000);
		System.out.println("Empno is passed....");
		assertNotNull(empName);
		System.out.println("Empname is passed....");
		System.out.println("testSomeAssertions is over....");

	}

}
