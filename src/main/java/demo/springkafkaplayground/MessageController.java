package demo.springkafkaplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/messages")
public class MessageController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void publish(@RequestBody MessageRequest messageRequest){

        kafkaTemplate.send("test", messageRequest.getMessage());

    }
}
