package com.mon.socket.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.mon.socket.client"
        }
)
public class ClientApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(
                ClientApplication.class,
                args
        );
    }

}