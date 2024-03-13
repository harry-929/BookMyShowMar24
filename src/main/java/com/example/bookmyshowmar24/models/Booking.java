package com.example.bookmyshowmar24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "bookings")
public class Booking extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @OneToMany
    private List<ShowSeat> showSeats;
    private int amount;

    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private User user;

}
