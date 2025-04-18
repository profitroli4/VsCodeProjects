package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "Bean")
    public com.example.demo.Bean getBean() {
        return new com.example.demo.Bean("This is a Bean");
    }

    @Bean
    public Institution institution() {
        return new Institution("City Hall", "Central Ave");
    }

    @Bean
    public Cafe cafe() {
        return new Cafe("Coffee Spot", "Park Street", "Espresso");
    }

    @Bean
    public Shop shop() {
        return new Shop("Gadget Store", "Tech Plaza", "Electronics");
    }

    @Bean
    public Library library() {
        return new Library("Downtown Library", "Main Street", 5000);
    }
}
