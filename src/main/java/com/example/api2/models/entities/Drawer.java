package com.example.api2.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Entity(name = "drawer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Drawer extends BaseEntity{
    @Column(name="name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private int capacity;
    private String status;


}
