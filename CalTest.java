import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Artinmac
 *
 */
public class CalTest {

	
	@Test
	public void testCal1() {

		int result = Cal.cal(2, 1, 3, 1, 2018);
		assertTrue("2,1, 3, 1, 2018", result == 28);
	}
	
	@Test
	public void testCal2() {
		int result = Cal.cal(3, 1, 4, 1, 2018);
		assertTrue("3, 1, 4, 1, 2018", result == 31);
	} 
	
	@Test
	public void testCal3() {
		int result = Cal.cal(4, 20, 5, 20, 2018);
		assertTrue("4, 20, 5, 20, 2018", result == 30);
	}
	
	@Test
	public void testCal4() {
		int result = Cal.cal(2, 20, 3, 25, 2018);
		assertEquals("2, 20, 3, 25, 2018", result, 33);	
	}

	@Test
	// Test if day2 < day1
	public void testCal5() {
		int result = Cal.cal(1, 4, 1, 2, 800);
		assertEquals("2 1, 3, 1, 800", result, 2);	
	}
	
	@Test
	// Test if day1 = day2
	public void testCal6() {
		int result = Cal.cal(2, 1, 2, 1, 800);
		assertEquals("2, 1, 3, 1, 800", result, 0);	
	}
	
	@Test
	// Test leap year exception
	public void testCal7() {
		int result = Cal.cal(2, 1, 3, 1, 200);
		assertEquals("2, 1, 3, 1, 200", result, 28);	
	}
	
	@Test
	public void testCal8() {
		int result = Cal.cal(2, 1, 3, 1, 800);
		assertEquals("2, 1, 3, 1, 200", result, 29);	
	}
	
	//test same month
    @Test
    public void testSameMonthSimple() {
          assertTrue("Expect 3", 3 == Cal.cal(8,1,8,4,2018) );
    }
   
    //test same month leap year
    @Test
    public void testSameMonthLeapSimple(){
          assertTrue("Expect 3", 3 == Cal.cal(8,1,8,4,2320) );
    }
   
    //test Feb month in non leap year
    @Test
    public void testFebNoLeap()
    {
          assertTrue("Expect 28", 28 == Cal.cal(2,1,2,29,2018) );
    }
   
    //test Feb month in leap year
    @Test
    public void testFebLeap()
    {
          assertTrue("February Leap year doesn't have 29 days. Expect Error.", 28 != Cal.cal(2,1,2,29,2320) );
    }
	
}
