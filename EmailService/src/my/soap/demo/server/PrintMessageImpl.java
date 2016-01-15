package my.soap.demo.server;
import javax.jws.WebService;


@WebService(endpointInterface = "my.soap.demo.server.PrintMessage")
public class PrintMessageImpl implements PrintMessage{

	@Override
	public String getMessageString(String msg) {
		return "Message recived is " + msg;
	}

}




