package com.sp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@Data
public class User {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Integer id;
    @Column(name = "USER_NAME")
    private String name;
    @Column(name = "USER_ADDRESS")
    private String address;
}
