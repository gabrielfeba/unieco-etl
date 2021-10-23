package com.unieco.etl.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Column;

@Document(collection = "address")
@Getter
public class AddressEntity {

    @Id
    @Column(name="_id")
    private String id;

    @Column(name="Active")
    private String active;

    @Column(name="CEP")
    private String cep;

    @Column(name="City")
    private String city;

    @Column(name="Complement")
    private String complement;

    @Column(name="DateRegister")
    private String dateRegister;

    @Column(name="DateUpdate")
    private String dateUpdate;

    @Column(name="District")
    private String district;

    @Column(name="IdWorker")
    private String idWorker;

    @Column(name="Lat")
    private String lat;

    @Column(name="Lon")
    private String lon;

    @Column(name="Number")
    private String number;

    @Column(name="State")
    private String state;

    @Column(name="Street")
    private String street;


}
