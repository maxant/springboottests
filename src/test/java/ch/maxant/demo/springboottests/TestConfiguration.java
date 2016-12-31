package ch.maxant.demo.springboottests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class TestConfiguration {

    @Primary
    @Bean
    public SomeService createMockService(){
        return new SomeService() {
            @Override
            public String doSomething(String s) {
                return "Using test bean";
            }
        };
    }
}
