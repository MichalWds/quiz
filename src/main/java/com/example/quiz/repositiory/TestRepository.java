package com.example.quiz.repositiory;

import com.example.quiz.model.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends
        CrudRepository<Test,Integer> {
}
