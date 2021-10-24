package com.unieco.etl.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;

@Document(collection = "worker")
@Getter
public class WorkerEntity {

    @Id
    @Column(name="_id")
    private String id;

    @Column(name="Active")
    private String active;

    @Column(name="CPFCNPJ")
    private String cpfCnpj;

    @Column(name="DateRegister")
    private String dateRegister;

    @Column(name="DateUpdate")
    private String dateUpdate;

    @Column(name="Description")
    private String description;

    @Column(name="EmailCorp")
    private String emailCorp;

    @Column(name="Facebook")
    private String facebook;

    @Column(name="IdUser")
    private String idUser;

    @Column(name="Image")
    private String image;

    @Column(name="Instagram")
    private String instagram;

    @Column(name="Office")
    private String office;

    @Column(name="PhoneCorp")
    private String phoneCorp;

    @Column(name="Site")
    private String site;

    @Column(name="SocialReason")
    private String socialReason;

    @Column(name="WhatsappNumber")
    private String whatsappNumber;

}
