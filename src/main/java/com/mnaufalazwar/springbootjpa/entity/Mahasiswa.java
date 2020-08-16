package com.mnaufalazwar.springbootjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Mahasiswa {

    @Id
    private String nim;
    private String nama;
    private String jurusan;
    private float ipk;

}
