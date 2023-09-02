package com.aritra.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Seat extends BaseModel{

    private String number;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private int row;

    @Enumerated(EnumType.ORDINAL)
    private int column;

    private SeatStatus seatStatus;
}
