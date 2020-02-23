package com.amarin.urlshortenerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UrlShortenerApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerApiApplication.class, args);
    }
}
