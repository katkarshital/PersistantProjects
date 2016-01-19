package com.my.demo.sender;

import com.my.demo.domain.Email;

public interface EmailSender {
	boolean sendMail(Email msg);

}
