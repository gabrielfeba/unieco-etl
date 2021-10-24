package com.unieco.etl.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;

@Document(collection = "worker")
@Getter
public class WorkerEntity {

    @Id
    @Field("_id")
    private String id;

    @Field("Active")
    private String active;

    @Field("CPFCNPJ")
    private String cpfCnpj;

    @Field("DateRegister")
    private String dateRegister;

    @Field("DateUpdate")
    private String dateUpdate;

    @Field("Description")
    private String description;

    @Field("EmailCorp")
    private String emailCorp;

    @Field("Facebook")
    private String facebook;

    @Field("IdUser")
    private String idUser;

    @Field("Image")
    private String image;

    @Field("Instagram")
    private String instagram;

    @Field("Office")
    private String office;

    @Field("PhoneCorp")
    private String phoneCorp;

    @Field("Site")
    private String site;

    @Field("SocialReason")
    private String socialReason;

    @Field("WhatsappNumber")
    private String whatsappNumber;

}
