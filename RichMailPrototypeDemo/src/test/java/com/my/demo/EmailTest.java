package com.my.demo;
import com.my.demo.domain.Email;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EmailTest extends TestCase{

	private Email testEmail;

	public EmailTest(){
		String[] To ={"shital@gmail.com","1234567894"};
		String From = "tryit@gmail.com";
		String Subject="Test Mail";
		String Body="take Care";
		testEmail = new Email(To,From,Subject,Body);

	}
	 public static Test suite()
    {
        return new TestSuite( EmailTest.class );
    }
    public void testValidEmail()
    {
       assertEquals(testEmail.validateEmail(),true);
    }
    public void testInValidBody()
    {
    	testEmail.setBody(null);
    	assertEquals(testEmail.validateEmail(),false);
    }
    public void testInValidSubject()
    {
    	testEmail.setSubject(null);
    	assertEquals(testEmail.validateEmail(),false);
    }
    public void testInValidFrom()
    {
    	testEmail.setFrom(null);
    	assertEquals(testEmail.validateEmail(),false);
    }
    public void testInValidTo1()
    {
    	testEmail.setTo(null);
    	assertEquals(testEmail.validateEmail(),false);
    }
    public void testInValidTo2()
    {
    	String[] list = {"shital@gmail.com","1235"};
    	testEmail.setTo(list);
    	assertEquals(testEmail.validateEmail(),false);
    }
    public void testInValidTo3()
    {
    	String[] list = {"shitalgmail.com","1234567891"};
    	testEmail.setTo(list);
    	assertEquals(testEmail.validateEmail(),false);
    }
    public void testValidTo()
    {
    	String[] list = {"shital@gmail.com","1234567891"};
    	testEmail.setTo(list);
    	assertEquals(testEmail.validateEmail(),true);
    }
}