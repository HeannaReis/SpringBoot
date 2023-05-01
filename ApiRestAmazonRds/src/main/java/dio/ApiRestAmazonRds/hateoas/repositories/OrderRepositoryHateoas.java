package dio.ApiRestAmazonRds.hateoas.repositories;

import dio.ApiRestAmazonRds.hateoas.entity.OrderHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryHateoas extends JpaRepository<OrderHateoas, Long> {
}
