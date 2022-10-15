package com.xyz.uni.rest.apis.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.uni.rest.apis.model.PaymentNotification;

public interface PaymentNotificationRepository extends CrudRepository<PaymentNotification, String> {

}
