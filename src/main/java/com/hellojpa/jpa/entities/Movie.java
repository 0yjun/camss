package com.hellojpa.jpa.entities;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
public class Movie extends Item{
    private String director;
    private String actor;
}
