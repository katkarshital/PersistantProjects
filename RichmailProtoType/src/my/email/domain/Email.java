package my.email.domain;

public class Email {
	private String[] To;
	private String From;
	private String Subject;
	private String Body;
	public Email(String[] To,String From,String Sub, String Body){
		this.To = To;
		this.From = From;
		this.Subject = Sub;
		this.Body = Body;
		   
	}
	public String[] getTo() {
		return To;
	}
	public void setTo(String[] to) {
		To = to;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}

}
