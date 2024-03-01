package com.example.camunda.integration.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LastStageDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution arg0) throws Exception {
        log.info("---------------> executing last stage");
    }
}