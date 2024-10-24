package com.codeWithProject.ecom.entity;


import com.codeWithProject.ecom.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    private UserRole role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] image;
}
