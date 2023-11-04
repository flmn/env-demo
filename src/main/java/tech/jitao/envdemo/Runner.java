package tech.jitao.envdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${demo.a}")
    private String valueA;

    @Value("${demo.b}")
    private String valueB;

    @Override
    public void run(String... args) throws Exception {
        logger.info("The valueA is {}.", valueA);
        logger.info("The valueB is {}.", valueB);
    }
}
