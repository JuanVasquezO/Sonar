package com.udea.vueloudea.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
public class UserF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;
    private String name;
    private String email;
    private String password;
    private String address;
    private String document_number;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public UserF() {
    }

    public UserF(long id_user, String name, String email, String password, String address, String document_number, Role role) {
        this.id_user = id_user;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.document_number = document_number;
        this.role = role;
    }

   





}

