package com.mandal.nest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "REGISTRATION_NUMBER")
    private String regNo;

    @Column(name = "COURSE")
    private String course;

    // Complete this with creating a table in the DB in both Postgres SQL and Oracle and
    // Annotate the above columns 
}
