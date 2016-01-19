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
public class StringHelperParameterizedBooleanTest {
	private StringHelper strHelper  = new StringHelper();
	private String input;
	private String result;
	
	public StringHelperParameterizedBooleanTest(String input,String result) {
		this.input = input;
		this.result = result;
	}
	@Parameters
	public static Collection<String[]> conditionList(){
		String[][] strList = {
				{"false","ABCD"},
				{"true","ABAB"},
				{"true","AB"},
				{"false","A"}};
	
		return Arrays.asList(strList);
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame1(){
		
		assertEquals(Boolean.valueOf(result),strHelper.areFirstAndLastTwoCharactersTheSame(input));
		//assertFalse(strHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	}
