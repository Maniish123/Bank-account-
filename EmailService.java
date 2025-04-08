package com.example.Bank_management_system.service;

import com.example.Bank_management_system.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
