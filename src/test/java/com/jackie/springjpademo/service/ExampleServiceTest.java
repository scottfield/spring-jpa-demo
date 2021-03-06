package com.jackie.springjpademo.service;

import com.jackie.springjpademo.entity.OpenPoState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleServiceTest {
    @Autowired
    private ExampleService exampleService;

    @Test
    public void find() throws Exception {
        OpenPoState criteria = new OpenPoState();
        criteria.setCustNo(554401);
        criteria.setState("this");
        criteria.setActive("y");
        List<OpenPoState> list = exampleService.find(criteria);
        System.out.println(list);
    }

}