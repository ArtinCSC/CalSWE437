import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
	public void thirdPredicateT(){
		/*
		 *  Tests predicate month2 == month1, Row 1, assignment: True 
		 */
		month2 = 4;
		
		assertTrue( 90 == Cal.cal(month1, day1, month2, day2, year)  );
		
	}
	
	@Test
	public void thirdPredicateF(){
		/*
		 *  Tests predicate month2 == month1, Row 2, assignment: False
		 */
		int month2 = 2;
		
		assertNotNull( 31 == Cal.cal(month1, day1, month2, day2, year)  );
	}
}
