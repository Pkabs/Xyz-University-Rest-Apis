package com.xyz.uni.rest.apis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.uni.rest.apis.model.PaymentNotification;
import com.xyz.uni.rest.apis.service.PaymentNotificationService;

//mark class as Controller  
@RestController

@RequestMapping("/PaymentNotification/v1")
public class PaymentNotificationController {

	// autowire the Payment Notification class

	@Autowired
	PaymentNotificationService paymentService;

	// creating post mapping that post students in the database
	@PostMapping("/payments")
	private String savePayment(@RequestBody PaymentNotification payment) {
		paymentService.saveOrUpdate(payment);
		return payment.getPaymentReference();
	}

}
