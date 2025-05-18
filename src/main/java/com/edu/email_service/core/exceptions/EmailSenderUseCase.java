package com.edu.email_service.core.exceptions;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}