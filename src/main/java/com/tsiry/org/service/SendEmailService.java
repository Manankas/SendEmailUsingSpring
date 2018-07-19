/**
 * 
 */
package com.tsiry.org.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.tsiry.org.dto.Email;

/**
 * @author Tsiry MANANKASINA
 *
 */
@Service("SendEmailService")
public class SendEmailService {
	@Autowired
	private JavaMailSender sender;
 
	public void sendEmail(Email e) throws Exception {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setTo(e.getTo());

		helper.setText(e.getText());

		helper.setSubject(e.getSubject());

		sender.send(message);

	}
}
