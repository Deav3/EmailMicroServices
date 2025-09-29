package com.Emailms.www.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.Emailms.www.dto.EmailRequest;
import com.Emailms.www.model.Email;
import com.Emailms.www.repository.EmailRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailService
{
	
	private final EmailRepository emailRepository;
	private final JavaMailSender javaMailSender;
	
	public String sendEmail(EmailRequest emailRequest) {
		try {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			
			simpleMailMessage.setTo(emailRequest.getTo());
			simpleMailMessage.setSubject(emailRequest.getSubject());
			simpleMailMessage.setText(emailRequest.getBody());
			javaMailSender.send(simpleMailMessage); // sending email from here
			
			
			//save in the database
			Email emailToSave= new Email();
			emailToSave.setRecipient(emailRequest.getTo());
			emailToSave.setSubject(emailRequest.getSubject());
			emailToSave.setBody(emailRequest.getBody());
			emailRepository.save(emailToSave);  //saving email  to database from here
			return "Email successfully sent";
		}catch(Exception e) {
			return e.getMessage();
		}
		
	}
	

}
