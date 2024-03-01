package com.example.camunda.integration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.camunda.integration.dtos.ProcessRequest;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("/start")
    public ResponseEntity<String> startProcess(@RequestBody ProcessRequest request) {
        runtimeService.startProcessInstanceByKey("processStages");
        return ResponseEntity.ok("Process " + request.getName() + " started");
    }
}
