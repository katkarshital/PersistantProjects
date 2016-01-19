package my.test.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	private StringHelper strHelper;
	
	@Before
	public void setup(){
		strHelper = new StringHelper();
	}
	@Test
	public void testTruncateAInFirst2Positions1() {
		
		assertEquals("CD",strHelper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		
		assertEquals("CD",strHelper.truncateAInFirst2Positions("ACD"));
		
	}
	@Test
	public void testTruncateAInFirst2Positions3() {
		
		assertEquals("CDEF",strHelper.truncateAInFirst2Positions("CDEF"));
		
	}
	@Test
	public void testTruncateAInFirst2Positions4() {
		
		assertEquals("CDAA",strHelper.truncateAInFirst2Positions("CDAA"));
		
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame1(){
		
		//assertEquals(false,strHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(strHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame2(){
		
		//assertEquals(true,strHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue(strHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame3(){
		
		//assertEquals(true,strHelper.areFirstAndLastTwoCharactersTheSame("AB"));
		assertTrue(strHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame4(){
		
		//assertEquals(false,strHelper.areFirstAndLastTwoCharactersTheSame("A"));
		assertFalse(strHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
