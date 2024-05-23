package com.example.ponto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class RecursosHumanos {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
