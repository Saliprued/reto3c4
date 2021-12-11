package com.reto3;

import com.reto3.repository.crud.GadgetInterface;
import com.reto3.repository.crud.OrderInterface;
import com.reto3.repository.crud.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3Application implements CommandLineRunner {
    @Autowired
    private GadgetInterface gadgetInterface;
    @Autowired
    private UserInterface userInterface;
    @Autowired
    private OrderInterface orderInterface;
    public static void main(String[] args) {
        SpringApplication.run(Reto3Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        gadgetInterface.deleteAll();
        userInterface.deleteAll();
        orderInterface.deleteAll();
    }
}
