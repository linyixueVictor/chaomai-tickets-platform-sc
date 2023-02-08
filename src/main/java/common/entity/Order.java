package com.yixue.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private String username;
    private String phone;
    private String address;
}
