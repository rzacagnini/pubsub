package net.javaproject.springbootrabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import net.javaproject.springbootrabbitmq.dto.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Slf4j
@Service
public class RabbitMQJsonConsumer {

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(User user) {
        log.info(String.format("Received JSON message -> %s", user.toString()));
    }

}
