package hu.kerdei.chuck.norris.joke.demoapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChuckNorrisJokeDemoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisJokeDemoappApplication.class, args);
    }

    @Bean
    ChuckNorrisQuotes chuckNorrisQuotesInit() {
        return new ChuckNorrisQuotes();
    }

}
