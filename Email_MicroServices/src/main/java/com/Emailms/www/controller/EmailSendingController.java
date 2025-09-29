package com.Emailms.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Emailms.www.dto.EmailRequest;
import com.Emailms.www.service.EmailService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailSendingController 
{
	
	@Autowired
	private EmailService emailService;
	
	
	@PostMapping("/send")
	public ResponseEntity<String> sendEmail(@Valid @RequestBody EmailRequest emailRequest)
	{
		emailService.sendEmail(emailRequest);
		return ResponseEntity.ok(emailService.sendEmail(emailRequest));
		
	}
	

}
