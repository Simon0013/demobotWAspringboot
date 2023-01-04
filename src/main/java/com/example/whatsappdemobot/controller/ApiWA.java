package com.example.whatsappdemobot.controller;

import java.nio.charset.Charset;
import java.util.UUID;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.*;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.springframework.mail.SimpleMailMessage;

public class ApiWA {
	private static String Token = "EAAIABk6fwZC0BAKkALA1zwzFCY1Czw51vfbQ2W51GCDkgM0gCLsyLY1rb0RHMSjFhFP70oKNCj0Jzl8UCCQ7Q43ZCZBSOGyuw8Tqk23Xo5hId8mmRzmQZBsA6AymKdrEYXpfQZBRC0eGUnGW3l1pRBLfjKJGaIAJZBilzZA6NMALNwG4V5ig15a2aVkk6v8Nodwf38m8uwjnwZDZD";

	public static void askNameSurname(String where) {
		sendMessage("Укажите, пожалуйста, Ваше имя и фамилию (через пробел)", where);
	}
	
	public static void askEmail(String where) {
		sendMessage("Укажите, пожалуйста, Ваш e-mail", where);
	}
	
	public static String sendVerificationCode(String where, String email, EmailSenderService emailService) {
		String confirmationToken = UUID.randomUUID().toString();
		SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(email);
        mailMessage.setSubject("Complete Registration!");
        mailMessage.setFrom("freeman_211@outlook.com");
        mailMessage.setText("Для завершения авторизации введите в WhatsApp-чат верификационный код: " + confirmationToken);
        emailService.sendEmail(mailMessage);
		sendMessage("Введите верификационный код, отправленный на Ваш e-mail", where);
		return confirmationToken;
	}
	
	public static void sendMessage(String body, String where) {
		try {
			String data = String.format("{ \"messaging_product\": \"whatsapp\", \"to\": \"%s\", \"type\": \"text\", \"text\": { \"body\": \"%s\" } }", where, body);
			System.out.println(data);
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost("https://graph.facebook.com/v15.0/107349008910125/messages");
			post.addHeader("Content-Type", "application/json; charset=utf-8");
			post.addHeader("Authorization", "Bearer " + Token);
			StringEntity entity = new StringEntity(data, Charset.forName("UTF-8"));
			post.setEntity(entity);
			httpClient.execute(post);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
