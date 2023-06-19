package com.hellojpa.jpa.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm")
    private String nm;

    @Column(name = "nm_eng")
    private String nmEng;

}
