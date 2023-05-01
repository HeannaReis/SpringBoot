package dio.ApiRestAmazonRds.myfirtsapi.repository;

import dio.ApiRestAmazonRds.myfirtsapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
