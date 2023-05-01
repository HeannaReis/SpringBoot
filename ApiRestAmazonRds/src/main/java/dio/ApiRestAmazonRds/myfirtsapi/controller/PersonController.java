package dio.ApiRestAmazonRds.myfirtsapi.controller;

import dio.ApiRestAmazonRds.myfirtsapi.entity.Person;
import dio.ApiRestAmazonRds.myfirtsapi.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repository) {
        this.repositoryPerson = repository;
    }

    @GetMapping("/")
    public String homePage(){
        return ("This is initial page, Welcome!");
    }
    @GetMapping("/persons")
    public List<Person>consultAllPersons(){
        return  repositoryPerson.findAll();
    }
    @GetMapping("/persons/{id}")
    public Optional<Person>consultById(@PathVariable Long id){
        return repositoryPerson.findById(id);
    }
}

