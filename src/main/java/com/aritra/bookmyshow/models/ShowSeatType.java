package com.aritra.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ShowSeatType extends  BaseModel{


    private Show show;

    private double price;

    private SeatType seatType;
}
