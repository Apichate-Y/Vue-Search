package com.example.demo.entity;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private @NonNull Long id;

    @NonNull
    private String userId;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private Long age;

    @NonNull
    private String address;

}