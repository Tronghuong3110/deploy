package com.example.demo.service.impl;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService implements ITest {
    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }
}
