package com.arrow.interview.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cmanon on 7/19/16.
 */
@RepositoryRestResource(collectionResourceRel = "race", path = "race")
public interface RaceRepository extends PagingAndSortingRepository<Race, Long> {
    List<Race> findByName(@Param("name") String name);
}
