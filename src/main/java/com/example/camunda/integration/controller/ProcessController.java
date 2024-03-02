package com.example.camunda.integration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.camunda.integration.dtos.ProcessRequest;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object> variables = new HashMap<>();
        variables.put("description", "my description");
        runtimeService.startProcessInstanceByKey("processStages", variables);
        return ResponseEntity.ok("Process " + request.getName() + " started");
    }
}
