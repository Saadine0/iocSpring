package org.example.presentation;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");//scanner les classes de ce package et creer les Beans
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());

    }
}