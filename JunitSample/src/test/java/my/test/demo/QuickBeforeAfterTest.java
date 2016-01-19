package my.test.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void setBeforeClass(){
		System.out.println("Before Class setup  Done");
	}
	@Before
	public void setup()
	{
		System.out.println("Setup  Done");
	}
	@Test
	public void test1() {
		System.out.println("test1 executed");
		
	}
	@Test
	public void test2() {
		System.out.println("test2 executed");
		
	}
	@After
	public void tearDown(){
		System.out.println("tearDown Done ");
	}
	@AfterClass
	public static void setAfterClass(){
		System.out.println("After Class cleanup  Done");
	}

}
