package com.kokos.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Document(collection = "contacts")
@Getter
@Setter
public class Contact {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String schoolName;
    private String message;
    private LocalDateTime submittedAt;
}
