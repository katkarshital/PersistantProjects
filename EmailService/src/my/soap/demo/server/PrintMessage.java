package my.soap.demo.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PrintMessage{
 
	@WebMethod 
	String getMessageString(String msg);

}