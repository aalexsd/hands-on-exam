package com.example.brf.brfapi.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    
    private Long id;
    private String name;
    private String role;

    User(String name, String role) {


        this.name = name;
        this.role = role;
    }


    public Long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public String getRole() {
        return this.role;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setRole(String role) {
        this.role = role;
    }

}
