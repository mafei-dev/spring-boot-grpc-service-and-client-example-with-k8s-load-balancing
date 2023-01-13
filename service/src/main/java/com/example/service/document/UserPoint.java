package com.example.service.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class UserPoint {
    @Id
    private String _id;
    private String username;
    private int points;
}
