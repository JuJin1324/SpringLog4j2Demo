package spring.boot.log4j2.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {

        log.debug("[jujiny] Starting Spring Boot Application...");
        SpringApplication.run(DemoApplication.class, args);

    }

}
