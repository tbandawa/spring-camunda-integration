package com.example.camunda.integration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.camunda.integration.dtos.ProcessRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController("/process")
public class ProcessController {

    @PostMapping("/start")
    public ResponseEntity<String> startProcess(@RequestBody ProcessRequest request) {
        return ResponseEntity.ok("Process " + request.getName() + " started");
    }
}
