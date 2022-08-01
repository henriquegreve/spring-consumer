package com.greve.spring.consumer.service.implementation;

import com.greve.spring.consumer.dto.Message;
import com.greve.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) throws Exception {
        System.out.println(message.getText());
    }
}
