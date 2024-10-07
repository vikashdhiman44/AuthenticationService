package org.example.userauthenticationservice_sept2024.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@JsonDeserialize(as = User.class)
@Getter
@Setter
public class User extends BaseModel {
    private String email;
    private String password;
}
