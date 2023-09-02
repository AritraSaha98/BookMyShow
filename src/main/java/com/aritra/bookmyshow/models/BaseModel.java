package com.aritra.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseModel {

    /*
     @Id is used to define  used to define the PK.

     @MappedSuperClass -> This is the parent class of all the classes which are extending this
     also the column within this class will be propagated in every child class as their column.

     @GeneratedValue annotation is used to allow the persistence implementation to assign a
     unique value to your identity fields automatically
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
