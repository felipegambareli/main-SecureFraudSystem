package com.bradesco.antifraud.service;

import com.azure.communication.email.models.*;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.bradesco.antifraud.model.EmailRequest;

import jakarta.validation.constraints.Email;

import org.springframework.stereotype.Service;
import com.azure.communication.email.*;
import com.azure.core.util.polling.*;

@Service
public class EmailService {
        public void sendEmail(EmailRequest emailRequest) {
                System.out.println("Iniciando envio de email...");
        }

}