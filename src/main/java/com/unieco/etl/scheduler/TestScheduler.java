package com.unieco.etl.scheduler;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    @Scheduled(cron = "0 * * ? * *")
    public void test() {
        System.out.println("TESTE");
    }
}
