package com.pronet.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by pr250155 on 5/19/17.
 */
@Table(name = "USER")
@Data
public class UserEntity {
    @Id
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GUID")
    private String guid;
}
