
This is a simple project for you to see Hystrix Circuit Breaker Working.

This example will open and break the circuit each 30 seconds.

1. install siege (or apache ab)
 $ brew install siege

2. run the app
 $ mvn spring-boot:run;

3. run siege (or apache ab)
 $ siege  -c 3 -r 100000 -b http://localhost:8080;

4. open your hystrix dashboard
http://localhost:8080/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8080%2Fhystrix.stream

