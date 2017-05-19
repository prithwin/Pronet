package com.pronet.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by pr250155 on 5/19/17.
 */
@Entity(name = "USER")
@Data
public class UserEntity {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GUID")
    private String guid;
}
