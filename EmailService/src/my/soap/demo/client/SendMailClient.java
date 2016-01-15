package my.soap.demo.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import my.soap.demo.server.PrintMessage;


public class SendMailClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:8090/EmailService/getMsg?wsdl");
	
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://server.demo.soap.my/", "PrintMessageImplService");

        Service service = Service.create(url, qname);

        PrintMessage msg = service.getPort(PrintMessage.class);

        System.out.println(msg.getMessageString("Shital"));

    }

}
