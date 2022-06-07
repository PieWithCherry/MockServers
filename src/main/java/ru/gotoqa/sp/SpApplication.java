package ru.gotoqa.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpApplication {
    public static int[] array = {0};

    public static void main(String[] args) {

        SpringApplication.run(SpApplication.class, args);


    }

}
// Объявить тут массив и реализовать его в counterData