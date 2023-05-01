package dio.ApiRestAmazonRds.hateoas.repositories;

import dio.ApiRestAmazonRds.apirest.Employee;
import dio.ApiRestAmazonRds.hateoas.entity.EmployeeHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryHateoas extends JpaRepository <EmployeeHateoas,Long> {
}
