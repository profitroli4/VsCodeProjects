package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public IInstitution library() {
        return new Library("Central Library", "Main St", 7000);
    }

    @Bean
    public IInstitution cafe() {
        return new Cafe("Sunny Cafe", "Baker St", "Cappuccino");
    }

    @Bean
    public IInstitution shop() {
        return new Shop("MegaMart", "Market Ave", "Groceries");
    }

    @Bean
    public IInstitution institution() {
        return new Institution("Town Hall", "Central Square");
    }

    @Bean
    public InstitutionComposite compositeInstitution() {
        return new InstitutionComposite(cafe());
    }
}