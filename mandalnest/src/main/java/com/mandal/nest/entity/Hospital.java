package com.mandal.nest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOSPITAL")
/**
 * This entity and it's component is for Hackathon
 */
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CITY")
    private String city;

    @Column(name = "RATING")
    private double rating;


}
