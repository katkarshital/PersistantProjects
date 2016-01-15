package my.soap.demo.server;
import javax.xml.ws.Endpoint;



public class PrintMessagePublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8090/EmailService/getMsg", new PrintMessageImpl());
	   System.out.print("Done with publishing");
    }

}