package com.aritra.bookmyshow.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    private ShowSeatState state;
}
