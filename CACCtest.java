import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CACCtest {

	@Before
	public void set(){
		
	}
	
	@Test
	public void testP1() {
		int month1 = 4, month2 = 4, day1 = 1, day2 = 1, year = 1;
		assertTrue( 0 == Cal.cal(month1, day1, month2, day2, year));	
	}
	
	@Test
	public void testP2() {
		int month1 = 4, month2 = 5, day1 = 1, day2 = 1, year = 1;
		assertTrue( 0 == Cal.cal(month1, day1, month2, day2, year));	
	}

}
