package com.udea.vueloudea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;



//comentario  para probar que funciona el sonarcloud

@Entity
@Getter
@Setter

public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_role;
    private String role;

    public Role() {}

    public Role(long id_role, String role) {
        this.id_role = id_role;
        this.role = role;
    }


}




