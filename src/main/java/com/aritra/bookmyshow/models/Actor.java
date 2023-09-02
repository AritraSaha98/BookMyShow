package com.aritra.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Actor extends BaseModel{

    private  String name;


}
