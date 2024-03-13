package com.example.bookmyshowmar24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "seats")
public class Seat extends BaseModel{
    private String seatNumber;
    
    @ManyToOne
    private SeatType seatType;
    private int rowVal;
    private int colVal;

    @ManyToOne
    private Screen screen;
}