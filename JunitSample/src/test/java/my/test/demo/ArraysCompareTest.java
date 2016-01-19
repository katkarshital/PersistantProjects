package my.test.demo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_randomArray() {
		int[] numList = {12,4,7,2};
		int[] expectedList = {2,4,7,12};
		Arrays.sort(numList);
		assertArrayEquals(expectedList,numList);
	}
	@Test(expected=NullPointerException.class)
	public void testArraySort_nullArray() {
		int[] numList = null;
		Arrays.sort(numList);
		
	}
	//@Test(expected=NullPointerException.class)-- generate error
	@Test
	public void testArraySort_emptylArray() {
		int[] numList = {};
		Arrays.sort(numList);
		
	}
	//Performance test
	@Test(timeout=100)
	public void testSort_Performance(){
		int array[] = {12,23,5};
		for(int i=1;i<1000000;i++){
			array[0]=i;
			Arrays.sort(array);
		}
		
	}

}
