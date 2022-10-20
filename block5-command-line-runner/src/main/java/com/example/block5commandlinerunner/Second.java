package com.example.block5commandlinerunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Second implements CommandLineRunner {

    //Creamos la segunda clase, que implementa CLR y completamos el método run()
    // Para que nos diga que estamos en la segunda clase

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soy la segunda clase");
    }
}
