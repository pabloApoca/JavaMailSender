package com.sendmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnviarCorreoController {

    @Autowired
    private JavaMailSender mail;

    @PostMapping("/sendemail")
    public ResponseEntity<?> enviarCorreo() {

        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("");
        email.setFrom("");
        email.setSubject("Mensaje de prueba 1");
        email.setText("No responder este email, es una prueba.");

        mail.send(email);

        return new ResponseEntity<>(true, HttpStatus.OK);
    }


}
