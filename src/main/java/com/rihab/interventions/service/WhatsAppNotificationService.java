package com.rihab.interventions.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class WhatsAppNotificationService {
/*
    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Value("${twilio.whatsapp.from}")
    private String fromWhatsAppNumber;

    public WhatsAppNotificationService() {
        Twilio.init(accountSid, authToken);
    }

    public void sendWhatsAppMessage(String toWhatsAppNumber, String message) {
        Message.creator(
                new PhoneNumber("whatsapp:" + toWhatsAppNumber),
                new PhoneNumber("whatsapp:" + fromWhatsAppNumber),
                message
        ).create();
    }
}
*/
}