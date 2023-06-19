package com.hellojpa.jpa.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "pw")
    private String pw;

   @Column(name = "nm")
    private String nm;



}
