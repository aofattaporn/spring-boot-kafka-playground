package demo.springkafkaplayground;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
		try {
			SpringApplication.run(KafkaApplication.class, args);

		}catch (Exception e){
			System.out.println("UnException {}" + e.toString());
		}
    }

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("test", "Hello haffuuuu :) " + i);
			}
		};
	}

}
