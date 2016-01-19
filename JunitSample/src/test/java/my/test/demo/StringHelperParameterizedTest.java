package my.test.demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	private StringHelper strHelper = new StringHelper();
	private String input;
	private String output;
	
	public StringHelperParameterizedTest(String input, String output) {
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> listConditions(){
		String[][] expectedList = {
				{"AACD","CD"},
				{"ACD","CD"},
				{"CDEF","CDEF"},
				{"CDAA","CDAA"}};
		
		return Arrays.asList(expectedList);
	}
	
	@Test
	public void testTruncateAInFirst2Positions1() {
		
		assertEquals(output,strHelper.truncateAInFirst2Positions(input));
		
	}
	
	
}
