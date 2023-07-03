package demo.springkafkaplayground;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageRequest {

    private String message;
}
