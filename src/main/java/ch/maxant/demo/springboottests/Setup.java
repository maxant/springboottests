package ch.maxant.demo.springboottests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Setup {
    
    @Bean
    public SomeService createService(){
        return new SomeServiceImpl();
    }
}
