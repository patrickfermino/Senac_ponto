package com.example.ponto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
