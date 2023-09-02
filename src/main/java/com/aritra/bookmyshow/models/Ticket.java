package com.aritra.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Ticket extends BaseModel{

    @ManyToOne
    private User bookedBy;

    @ManyToOne
    private Show show;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;

    private Date timeOfBooking;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus status;

    private double amount;

}
