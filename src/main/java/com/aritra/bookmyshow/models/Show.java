package com.aritra.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    private Date startTime;

    private Date endTime;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;

}
