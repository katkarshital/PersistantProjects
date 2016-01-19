package com.my.demo.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.my.demo.domain.Email;

public class EmailServer {
	FileOutputStream out1,out2;
	public EmailServer(){
		try {
			File msgFile =new File("Message.txt");
			File smsFile =new File("SMS.txt");
			out1=new FileOutputStream(msgFile, true);
			out2=new FileOutputStream(smsFile, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public boolean send(Email msg){
		String[] recepientList = msg.getTo();
		String from = msg.getFrom();
		String sub = msg.getSubject();
		String body = msg.getBody();
		
		int i=0;
		while(i<recepientList.length){
			String[] list = {recepientList[i],from,sub,body};
			
			if(recepientList[i].contains("@")){
				new Thread(new FileServer(out1,list)).start();
			}else{
				new Thread(new FileServer(out2,list)).start();
			}
			i++;
		}
		
		return true;
	}

}
