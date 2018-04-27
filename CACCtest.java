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
	//Predicate: month2 == month1, Row 1
	@Test
	public void testP1() {
		 month1 = 4;
		 month2 = 4;
		assertTrue( 0 == Cal.cal(month1, day1, month2, day2, year));	
	}
	//Predicate: month2 == month1, Row 2
	@Test
	public void testP2() {
		 month1 = 4;
		 month2 = 5;
		assertTrue( 30 == Cal.cal(month1, day1, month2, day2, year));	
	}
	/*
	 * predicate = (m4 != 0) || ((m100 == 0) && (m400 != 0))
	 * it implements row 3 in the truth table, which determinant Pa = true
	 */
	@Test
	public void testPaTrue() { 
		 year = 2003;
		assertTrue(31 == Cal.cal(month1, day1, month2, day2, year));
	}
	
	/*
	 * predicate = (m4 != 0) || ((m100 == 0) && (m400 != 0))
	 * it implements row 5 in the truth table, which determinant Pb = true and Pc = true
	 */
	@Test
	public void testPbPcTrue() {
		 year = 2300;
		assertTrue(31 == Cal.cal(month1, day1, month2, day2, year));
	}
	
	/*
	 * predicate = (m4 != 0) || ((m100 == 0) && (m400 != 0))
	 * it implements row 7 in the truth table, which determinant Pa = False and Pb = False
	 */
	@Test
	public void test2PaPbFalse(){
		year = 2004;
		assertTrue( 31 == Cal.cal(month1, day1, month2, day2, year));
	}
	
	/*
	 * predicate = (m4 != 0) || ((m100 == 0) && (m400 != 0))
	 * it implements row 6 in the truth table, which determinant Pc = False
	 */
	@Test
	public void testPcFalse() {
		 year = 2400;
			assertTrue(31 == Cal.cal(month1, day1, month2, day2, year));
	}
	
	 /*
 	  *  Tests predicate month2 == month1, Row 1, assignment: True 
	  */
	@Test
 	public void thirdPredicateT(){

 		month2 = 4;
 		
 		assertTrue( 90 == Cal.cal(month1, day1, month2, day2, year)  );
 		
 	}
 	        /*
 		 *  Tests predicate month2 == month1, Row 2, assignment: False
 		 */
 	@Test
 	public void thirdPredicateF(){
 		
 		int month2 = 2;
 		
 		assertNotNull( 31 == Cal.cal(month1, day1, month2, day2, year)  );
 	}
}
