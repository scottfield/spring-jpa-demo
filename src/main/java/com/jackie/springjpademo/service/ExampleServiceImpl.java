package com.jackie.springjpademo.service;

import com.jackie.springjpademo.entity.OpenPoState;
import com.jackie.springjpademo.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    private ExampleRepository exampleRepository;

    @Override
    public List<OpenPoState> find(OpenPoState criteria) {
        return exampleRepository.findAll();
    }
}
