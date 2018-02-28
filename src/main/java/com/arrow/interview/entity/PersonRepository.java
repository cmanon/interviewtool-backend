package com.arrow.interview.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "person", path = "person")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//    //@PreAuthorize("hasRole('ROLE_ADMIN')")
//    List<Person> findByUsername(@Param("username") String username);
//}
//

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByUsernameLike(@Param("username") String username);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    Page<Person> findAll(Pageable pageable);

    @Override
    @PostAuthorize("returnObject.username == principal.username OR hasRole('ROLE_ADMIN')")
    Person findOne(Long aLong);

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    Person findByUsername(@Param("username") String username);
}
