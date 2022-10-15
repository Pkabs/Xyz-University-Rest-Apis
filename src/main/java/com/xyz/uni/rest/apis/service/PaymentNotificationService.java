package com.xyz.uni.rest.apis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.uni.rest.apis.model.PaymentNotification;
import com.xyz.uni.rest.apis.repository.PaymentNotificationRepository;

//defining the business logic  
@Service
public class PaymentNotificationService {
	
	@Autowired
	PaymentNotificationRepository paymentNotificationRepository;
	
	// saving a payment notification record by using the method save() of CrudRepository
		public void saveOrUpdate(PaymentNotification paymentNotification) {
			paymentNotificationRepository.save(paymentNotification);
		}

}
