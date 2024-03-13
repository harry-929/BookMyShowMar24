package com.example.bookmyshowmar24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "cities")
public class City extends BaseModel{
    private String name;
    //private List<Threater> threaters;
}
