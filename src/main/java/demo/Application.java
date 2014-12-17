package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
@EnableCircuitBreaker
@EnableHystrixDashboard
public class Application {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String home() {
        return String.valueOf(helloService.sayHello());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}