package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class ClientserviceApplication{

    @Autowired
    ClientserviceApplication clientService;

    public static void main(String[] args) {
        SpringApplication.run(ClientserviceApplication.class, args);
    }




}
