package com.example.bookmyshowmar24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "theaters")
public class Threater extends BaseModel{
    private String name;
    @ManyToOne
    private City city;
    @OneToMany
    private List<Screen> screens;
}
