package com.mandal.nest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
/**
 * This entity and it's component is for Hackathon
 */
public class Hospital {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private double rating;


}
