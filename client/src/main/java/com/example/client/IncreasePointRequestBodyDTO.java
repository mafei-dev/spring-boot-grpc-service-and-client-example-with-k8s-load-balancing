package com.example.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class IncreasePointRequestBodyDTO {
    private String username;
    private int amount;
    private String reason;
}
