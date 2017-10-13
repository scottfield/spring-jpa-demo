package com.jackie.springjpademo.repository;

import com.jackie.springjpademo.entity.OpenPoState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<OpenPoState, Integer> {
}
