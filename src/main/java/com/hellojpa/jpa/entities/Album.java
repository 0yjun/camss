package com.hellojpa.jpa.entities;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Album extends Item{
    private String artist;
}
