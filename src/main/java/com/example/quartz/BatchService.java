package com.example.quartz;

import lombok.RequiredArgsConstructor;
import org.quartz.SchedulerException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Component
public class BatchService {
    private final QuartzService quartzService;

    @PostConstruct
    public void init() {
        try {
            quartzService.addSimpleJob(QuartzJob.class, "batchJob", "Quartz 잡",null , 10);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}