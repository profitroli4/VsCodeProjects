package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        Bean testBean = context.getBean("Bean", Bean.class);

        System.out.println(testBean.getName());

        Institution institution = context.getBean(Institution.class);
        institution.displayInfo();

        Cafe cafe = context.getBean(Cafe.class);
        cafe.displayInfo();

        Shop shop = context.getBean(Shop.class);
        shop.displayInfo();

        Library library = context.getBean(Library.class);
        library.displayInfo();

        context.close();
    }
}