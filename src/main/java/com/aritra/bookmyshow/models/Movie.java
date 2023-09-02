package com.aritra.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;
import java.util.List;

@Data
@Entity
public class Movie extends BaseModel{

    private String name;

    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Genre> genre;

    private Duration duration;

}
