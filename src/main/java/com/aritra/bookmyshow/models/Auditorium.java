package com.aritra.bookmyshow.models;

import jakarta.persistence.*;

import lombok.Data;

import javax.swing.*;
import java.util.List;

@Data
@Entity
public class Auditorium extends BaseModel{

    private String  name;

    @OneToMany
    private List<Seat> seats;

    @OneToMany(mappedBy = "auditorium")
    private List<Show> shows;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> auditoriumFeatures;

}
