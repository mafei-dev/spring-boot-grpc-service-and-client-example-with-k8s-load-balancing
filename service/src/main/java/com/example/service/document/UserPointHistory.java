package com.example.service.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class UserPointHistory {
    @Id
    private String _id;
    private String userPointId;
    private int changedBy;
    private PointUpdateState pointUpdateState;
    private String reason;
}
