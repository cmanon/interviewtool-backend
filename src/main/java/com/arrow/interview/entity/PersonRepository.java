package com.arrow.interview.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepositoryImpl extends PagingAndSortingRepository<Person, Long> {
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    List<Person> findByUsername(@Param("username") String username);
}
