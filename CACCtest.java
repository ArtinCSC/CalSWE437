import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.Test;

public class CACCtest {

	private int month1, day1, month2, day2, year;

	@Before
	public void set(){
		month1 = 1;
		day1 = 1;
		month2 = 2;
		day2 = 1;
		year = 1;
	}
	
	@Test
	public void testP1() {
		 month1 = 4;
		 month2 = 4;
		assertTrue( 0 == Cal.cal(month1, day1, month2, day2, year));	
	}
	
	@Test
	public void testP2() {
		 month1 = 4;
		 month2 = 5;
		assertTrue( 30 == Cal.cal(month1, day1, month2, day2, year));	
	}
	
		@Test
	public void testPaTrue() {
		 year = 2003;
		assertTrue(31 == Cal.cal(month1, day1, month2, day2, year));
	}
	
		@Test
	public void testPbPcTrue() {
		 year = 2300;
		assertTrue(31 == Cal.cal(month1, day1, month2, day2, year));
	}

	@Test
	public void test2PaPbFalse(){
		year = 2004;
		assertTrue( 31 == Cal.cal(month1, day1, month2, day2, year));
	}
}
