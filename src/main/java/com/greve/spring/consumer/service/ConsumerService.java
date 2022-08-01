package com.greve.spring.consumer.service;

import com.greve.spring.consumer.dto.Message;

public interface ConsumerService {
    void action(Message message) throws Exception;
}
