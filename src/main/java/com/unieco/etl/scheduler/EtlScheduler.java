package com.unieco.etl.scheduler;


import com.unieco.etl.service.EtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EtlScheduler {

    @Autowired
    private EtlService etlService;

    @Scheduled(cron = "0 * * ? * *")
    public void test() {
        System.out.println("TESTE");
    }
}
