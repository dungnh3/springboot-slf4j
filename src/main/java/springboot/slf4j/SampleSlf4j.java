package springboot.slf4j;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
public class SampleSlf4j {

    public static void print(String message) {
        log.info(message);
    }
}
