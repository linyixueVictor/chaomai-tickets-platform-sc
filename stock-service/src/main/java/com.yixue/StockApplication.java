package com.yixue;

import com.yixue.controller.StockController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerformApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockController.class);
    }
}
