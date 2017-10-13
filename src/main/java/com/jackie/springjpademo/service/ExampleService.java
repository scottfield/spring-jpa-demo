package com.jackie.springjpademo.service;

import com.jackie.springjpademo.entity.OpenPoState;

import java.util.List;

public interface ExampleService {
    List<OpenPoState> find(OpenPoState criteria);
}
