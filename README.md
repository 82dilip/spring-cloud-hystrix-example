
This is a simple project for you to see Netflix OSS Hystrix (Circuit Breaker) working with Spring Cloud.

This example will open and break the circuit each 30 seconds.

**install siege (or apache ab)**

  $ brew install siege

**run the app**

  $ mvn spring-boot:run;

**run siege (or apache ab)**

  $ siege  -c 3 -r 100000 -b http://localhost:8080;

**open your hystrix dashboard in your favorite browser**

  http://localhost:8080/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8080%2Fhystrix.stream

