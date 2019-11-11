package com.nh.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Classname KafkaReceiver
 * @Description TODO
 * @Date 2019/10/18 6:02 PM
 * @Created by nihui
 */
@Component
public class KafkaReceiver {
    private static Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(topics = {"test-topic"})
    public void listen(ConsumerRecord<?,?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            logger.info("----------------- record =" + record);
            logger.info("------------------ message =" + message);
        }

    }
}
