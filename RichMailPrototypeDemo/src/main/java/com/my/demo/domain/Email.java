package com.my.demo.domain;

public class Email {
	private String[] To;
	private String From;
	private String Subject;
	private String Body;
	private String ErrorMsg;
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public Email(String[] To,String From,String Sub, String Body){
		this.To = To;
		this.From = From;
		this.Subject = Sub;
		this.Body = Body;
		this.ErrorMsg =null;
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

	public boolean validateEmail(){
	
		if(this.To == null){
			this.ErrorMsg = "No Recipent Avaiable";
			return false;
		}
		if(this.From ==null){
			this.ErrorMsg = "No Sender Avaiable";
			return false;
		}
		if(this.Subject == null){
			this.ErrorMsg = "No Subject Avaiable";
			return false;			
		}
		if( this.Body ==null){
			this.ErrorMsg = "No Message Body Avaiable";
			return false;
		}
		int i=0;
		String[] list = this.To;
		while(i<list.length){
			if(list[i].contains("@")){
				i++;
				continue;
			}
			else{
				if(list[i].length() !=10){
					this.ErrorMsg = "Not Valid Recipent Address/Number";
					return false;
				}
				if(list[i].matches("\\d{10}")){
					i++;
					continue;
				}
				else {
					this.ErrorMsg = "Not Valid Recipent Address";
					return false;					
				}
			}
			
		}
		return true;
	}
}
