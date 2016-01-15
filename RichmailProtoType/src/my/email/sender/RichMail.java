package my.email.sender;

import my.email.domain.Email;
import my.email.server.EmailServer;

public class RichMail implements EmailSender{
	private EmailServer emailServer;
	public RichMail(){
		emailServer = new EmailServer();
	}
	@Override
	public boolean sendMail(Email msg) {
		if(emailServer.send(msg)){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		String[] To ={"shital@gmail.com","1234"};
		String From = "tryit@gmail.com";
		String Subject="Test Mail";
		 String Body="take Care";
		 Email msg = new Email(To,From,Subject,Body);
		 RichMail richObj = new RichMail();
		 if(richObj.sendMail(msg)){
			 System.out.println("Message Delivered");
		 }
		 
	}

}
