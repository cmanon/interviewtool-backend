package com.arrow.interview.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "question", path = "question")
@PreAuthorize("hasRole('ROLE_USER')")
public interface QuestionRepository extends PagingAndSortingRepository<Question, Long> {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    List<Question> findAllByAnswer(@Param("answer") String answer);
}
