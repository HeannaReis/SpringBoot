package dio.ApiRestAmazonRds;

import dio.ApiRestAmazonRds.myfirtsapi.entity.Person;
import dio.ApiRestAmazonRds.myfirtsapi.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiRestAmazonRdsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiRestAmazonRdsApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository repository){
		return args ->{
			repository.save(new Person("Roger", "Guedes" ));
			repository.save(new Person("Gustavo", "Mosquito" ));
		};
	}
}
