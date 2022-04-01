package com.iteesoft.sta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Properties;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.iteesoft.sta"})
public class EmsConfig implements WebMvcConfigurer {

    @Bean
    public JavaMailSender getJavaMailSender() {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setUsername("asafeadey@gmail.com");
        mailSender.setPassword("obaloluwa");
        mailSender.setPort(587);

        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.starttls.trust", "smtp.gmail.com");

        mailSender.setJavaMailProperties(properties);

        return mailSender;
    }

}
