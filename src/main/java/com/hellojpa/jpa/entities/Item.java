package com.hellojpa.jpa.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@Data
public abstract class Item extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;
}
