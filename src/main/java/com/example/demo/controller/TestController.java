package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class TestController {

    @Autowired
    private ITest test;

    @GetMapping("/test")
    public String test() {
        return "success";
    }

    @GetMapping("/tests")
    public List<Test> findAll() {
        return test.findAll();
    }
}
