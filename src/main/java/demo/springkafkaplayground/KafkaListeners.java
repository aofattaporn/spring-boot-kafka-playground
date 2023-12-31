package demo.springkafkaplayground;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "test",
            groupId = "userID"
    )
    void listener(String data){
        System.out.println("Listener received:" + data + " ");
    }
}
