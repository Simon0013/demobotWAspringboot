package com.example.whatsappdemobot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.*;

@RestController
@RequestMapping("webhook")
public class MessageController {
	private static int MessageCount;
	private static String email;
	private static String verifyCode;
	
	@Autowired
	EmailSenderService emailSenderService;
	
    @PostMapping
    public String AnswerWebhook(@RequestBody RequestWebhook hook) throws IOException {
        for (var message : hook.getEntry().get(0).getChanges().get(0).getValue().getMessages()) {
        	if (message.getFrom().compareTo(hook.getEntry().get(0).getChanges().get(0).getValue().getMetadata().getDisplayPhoneNumber()) == 0)
                continue;
            ++MessageCount;
            String option = message.getText().getBody().split(" ")[0].toLowerCase();
            String telephone = message.getFrom();
            if (telephone.startsWith("7"))
            	telephone = "78" + telephone.substring(1);
            switch (MessageCount) {
	            case 1:
	            	ApiWA.askNameSurname(telephone);
	            	break;
	            case 2:
	            	ApiWA.askEmail(telephone);
	            	break;
	            case 3:
	            	email = option;
	            	verifyCode = ApiWA.sendVerificationCode(telephone, email, emailSenderService);
		            break;
	            case 4:
	            	if (verifyCode.compareTo(option) == 0) {
	            		ApiWA.sendMessage("Верификация пройдена успешно!", telephone);
	            	}
	            	else {
	            		ApiWA.sendMessage("Неверный код верификации! Мы отправим Вам письмо с новым кодом", telephone);
	            		verifyCode = ApiWA.sendVerificationCode(telephone, email, emailSenderService);
	            		MessageCount = 3;
	            	}
	            	break;
            }
        }
        return  "ok";
    }
}