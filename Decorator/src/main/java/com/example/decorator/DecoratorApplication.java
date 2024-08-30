package com.example.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootApplication
public class DecoratorApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(DecoratorApplication.class, args);
//
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        Beverage beverage2 = new HouseBlend();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
//
//
//    }

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Projects\\Design_Patterns\\Decorator\\src\\main\\java\\com\\example\\decorator\\test.txt")));

            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
