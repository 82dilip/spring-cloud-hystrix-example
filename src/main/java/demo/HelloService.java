package demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class HelloService {

    int i = 0;

    @HystrixCommand(fallbackMethod = "fallback")
    public String sayHello() {
        if (LocalTime.now().getSecond() > 30)
            throw new RuntimeException();

        return " =) Hello from Principal => " + i++;
    }

    public String fallback() {
        return " =( Hello from Fallback => " + i++;
    }
}