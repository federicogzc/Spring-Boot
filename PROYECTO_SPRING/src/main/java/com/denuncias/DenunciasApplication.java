package com.denuncias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicializa el Framework Spring Boot.
 * Cumple con el estándar de codificación para el punto de entrada de la aplicación.
 */
@SpringBootApplication
public class DenunciasApplication {

    public static void main(String[] args) {
        SpringApplication.run(DenunciasApplication.class, args);
        System.out.println("Módulo Web de Denuncias inicializado con Spring Boot");
    }
}