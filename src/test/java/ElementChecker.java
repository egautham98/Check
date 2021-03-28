import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementChecker {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SeleniumRunner R=new SeleniumRunner();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SeleniumRunner R1=new SeleniumRunner();
		if(R1.Runner().equals("Element_Found"))
			assert(true);
	}

}
