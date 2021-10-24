package com.unieco.etl.controller;

import com.unieco.etl.service.EtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtlController {

    @Autowired
    private EtlService service;

    @PostMapping("/execute")
    public ResponseEntity<Void> execute() {
        service.execute();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
