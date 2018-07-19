/**
 * 
 */
package com.tsiry.org.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsiry.org.dto.Email;
import com.tsiry.org.service.SendEmailService;

/**
 * @author Tsiry MANANKASINA
 *
 */
@RestController
public class SimpleEmailController {
	
	@Autowired
	private JavaMailSender sender;

	@Autowired
	private SendEmailService emailservice; 
	
	@PostMapping("/simpleemail")
	public String sendSimpleEmail(@RequestBody Email email) {
		try {
			emailservice.sendEmail(email);
			return "Email Sent!";

		} catch (Exception ex) {
			return "Error in sending email: " + ex;

		}

	}
	
}
