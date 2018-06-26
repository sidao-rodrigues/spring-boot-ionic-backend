package com.sidao.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sidao.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
