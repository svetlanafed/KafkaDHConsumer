package com.example.kafkadhconsumer.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String productName;
    private String code;
    private int quantity;
    private double price;
}