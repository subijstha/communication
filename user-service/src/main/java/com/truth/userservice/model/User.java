package com.truth.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String firstName;
private String lastName;
@Column(nullable = false, unique = true)
private String email;
private String departmentId;
}
