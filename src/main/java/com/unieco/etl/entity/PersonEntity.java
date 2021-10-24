package com.unieco.etl.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "person")
@Getter
public class PersonEntity {

    @Id
    @Field("_id")
    private String id;

    @Field("Active")
    private String active;

    @Field("BirthDate")
    private String birthDate;

    @Field("CellNumber")
    private String cellNumber;

    @Field("DateLastLogin")
    private String dateLastLogin;

    @Field("DateRegister")
    private String dateRegister;

    @Field("DateUpdate")
    private String dateUpdate;

    @Field("Email")
    private String email;

    @Field("Image")
    private String image;

    @Field("Name")
    private String name;

    @Field("Password")
    private String password;

    @Field("Services")
    private String services;

    @Field("ServicesAccessed")
    private String servicesAccessed;

    @Field("ServicesContact")
    private String servicesContact;

    @Field("TypeUser")
    private String typeUser;

    @Field("Username")
    private String username;

}
