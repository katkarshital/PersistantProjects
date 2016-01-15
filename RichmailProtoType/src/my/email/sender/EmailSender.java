package my.email.sender;

import my.email.domain.Email;

public interface EmailSender {
	boolean sendMail(Email msg);

}
