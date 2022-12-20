package com.example.day7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.lang.NonNull;


@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    private Integer id;

    @NotEmpty(message = "Name may not be empty")
    @Min(value = 4)
    private String name;

    @NotEmpty(message = "Name may not be empty")
    @Min(value = 4)
    @Column(unique=true)
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    @Column(unique=true)
    @Pattern(   regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;


    @NotEmpty
    @Pattern(regexp = "user|admin")
    private String role;

    @NonNull
    private Integer age;

}
