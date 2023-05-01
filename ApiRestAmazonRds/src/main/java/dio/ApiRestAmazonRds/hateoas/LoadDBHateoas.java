package dio.ApiRestAmazonRds.hateoas;

import dio.ApiRestAmazonRds.hateoas.entity.EmployeeHateoas;
import dio.ApiRestAmazonRds.hateoas.entity.OrderHateoas;
import dio.ApiRestAmazonRds.hateoas.entity.Status;
import dio.ApiRestAmazonRds.hateoas.repositories.EmployeeRepositoryHateoas;
import dio.ApiRestAmazonRds.hateoas.repositories.OrderRepositoryHateoas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDBHateoas {

    private static final Logger log = LoggerFactory.getLogger(LoadDBHateoas.class);
    // persistindo dados no banco com jpa

    @Bean
    CommandLineRunner loaddata(EmployeeRepositoryHateoas employeeRepositoryHateoas, OrderRepositoryHateoas orderRepositoryHateoas) {
        return args -> {
            log.info("Log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Maria Adelaide", "motorista",
                    "Rua teste 100")));
            log.info("log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Junior Urso", "Jogador",
                    "rua testando 333")));
            log.info("Log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Otavio Otaviano", "Dentista",
                    "The shine")));
            orderRepositoryHateoas.save(new OrderHateoas(Status.COMPLETED, "review"));
            orderRepositoryHateoas.save(new OrderHateoas(Status.IN_PROGRESS, "travel"));
            orderRepositoryHateoas.save(new OrderHateoas(Status.IN_PROGRESS, "sale"));
            orderRepositoryHateoas.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
