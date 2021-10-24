package com.unieco.etl.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;

@Document(collection = "address")
@Getter
public class AddressEntity {

    @Id
    @Field("_id")
    private String id;

    @Field("Active")
    private String active;

    @Field("CEP")
    private String cep;

    @Field("City")
    private String city;

    @Field("Complement")
    private String complement;

    @Field("DateRegister")
    private String dateRegister;

    @Field("DateUpdate")
    private String dateUpdate;

    @Field("District")
    private String district;

    @Field("IdWorker")
    private String idWorker;

    @Field("Lat")
    private String lat;

    @Field("Lon")
    private String lon;

    @Field("Number")
    private String number;

    @Field("State")
    private String state;

    @Field("Street")
    private String street;


}
