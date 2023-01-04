package com.example.whatsappdemobot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("webhook")
public class WebhookController {
	@GetMapping
	public ResponseEntity AnswerWebhook(@RequestParam("hub.verify_token") String verification,
			@RequestParam("hub.mode") String mode,
			@RequestParam("hub.challenge") String challenge) {
		System.out.println(challenge);
		System.out.println(mode);
		System.out.println(verification);
		String VERIFY_TOKEN = "demobotsim0013";
		if ((verification.compareTo(VERIFY_TOKEN) == 0) && (mode.compareTo("subscribe") == 0))
			return ResponseEntity.ok().body(challenge);
		else
			return ResponseEntity.status(403).build();
	}
}
