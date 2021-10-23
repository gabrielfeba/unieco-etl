package com.unieco.etl.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;

@Document(collection = "person")
@Getter
public class PersonEntity {

    @Id
    @Column(name="_id")
    private String id;

    @Column(name="Active")
    private String Active;

    @Column(name="BirthDate")
    private String BirthDate;

    @Column(name="CellNumber")
    private String CellNumber;

    @Column(name="DateLastLogin")
    private String DateLastLogin;

    @Column(name="DateRegister")
    private String DateRegister;

    @Column(name="DateUpdate")
    private String DateUpdate;

    @Column(name="Email")
    private String Email;

    @Column(name="Image")
    private String Image;

    @Column(name="Name")
    private String Name;

    @Column(name="Password")
    private String Password;

    @Column(name="Services")
    private String Services;

    @Column(name="ServicesAccessed")
    private String ServicesAccessed;

    @Column(name="ServicesContact")
    private String ServicesContact;

    @Column(name="TypeUser")
    private String TypeUser;

    @Column(name="Username")
    private String Username;

}
