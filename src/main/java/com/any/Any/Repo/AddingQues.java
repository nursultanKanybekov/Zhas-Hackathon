package com.any.Any.Repo;

import com.any.Any.Model.AddingQuestions;
import com.any.Any.Model.QuestionsM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddingQues extends CrudRepository<AddingQuestions, Long> {
}
