package bike.trestorres.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by cmanon on 7/14/16.
 */
@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {
    List<Location> findByName(@Param("name") String name);
}
