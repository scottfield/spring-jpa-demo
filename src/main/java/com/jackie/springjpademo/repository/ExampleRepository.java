package com.jackie.springjpademo.repository;

import com.jackie.springjpademo.entity.OpenPoState;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<OpenPoState, Integer> {
    ExampleMatcher.PropertyValueTransformer stringTransformer = source -> {
        if(StringUtils.isBlank(source.toString()))
            return null;
        else
            return source.toString().trim();
    };
    ExampleMatcher MATCHER = ExampleMatcher
            .matching()
            .withMatcher("state", matcher -> matcher.transform(stringTransformer).contains().ignoreCase())
            .withMatcher("active", matcher -> matcher.transform(stringTransformer).ignoreCase());

}
