package com.iteesoft.sta.service.impl;

import com.iteesoft.sta.service.EmsEmailService;
import org.springframework.mail.SimpleMailMessage;

public class EmsEmailServiceImpl implements EmsEmailService {
    @Override
    public void sendEmail(String userEmail, String password, String fName) {

        SimpleMailMessage newMail = new SimpleMailMessage();
        newMail.setTo(userEmail);
        newMail.setSubject("Hello " + fName + ",/n");
        newMail.setText("Your account has been successfully created with the following login details/n username: "+ userEmail+ "/n password: "+ password);


    }
}
