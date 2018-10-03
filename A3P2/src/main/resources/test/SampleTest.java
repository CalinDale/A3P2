

import junit.framework.TestCase;

public class SampleTest extends TestCase {

	public class SampleServlet {
		public String correctName;
		public String correctPass;
		
		public boolean checkLogin(String name, String password) {
			if (name == this.correctName && password == this.correctPass) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	private SampleServlet obj;
	
	protected void setUp() throws Exception {
		super.setUp();
		obj = new SampleServlet();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		obj = null;
	}
	
	public void testCheckLogin() {
		String testCorrectName = "dave";
		String testCorrectPass = "simpsons";
		
		obj.correctName = testCorrectName;
		obj.correctPass = testCorrectPass;
		
		String testWrongName = "jhon";
		String testWrongPass = "123";
		
		assertFalse(obj.checkLogin(testWrongName, testWrongPass));
		assertTrue(obj.checkLogin(testCorrectName, testCorrectPass));
	}
	
}
