package com.aritra.bookmyshow.models;

import jakarta.persistence.*;


import java.util.Date;

public class Payment extends BaseModel{

    private Date date;

    private double Amount;

    private String referenceNumber;

    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;

    @ManyToOne
    private Ticket ticket;
}
