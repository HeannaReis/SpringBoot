package dio.ApiRestAmazonRds.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@RestController
    public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    //definindo um label para o GetMapping
    //criar método do tipo lista de employees
    @GetMapping("/employees")
    public List<Employee> listOfEmployeeAll(){
        return repository.findAll();
    }

    //adicionando um employee
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee){
        return repository.save(newEmployee);
    }

    //Get para único employee
    @GetMapping("/employees/{id}")
    Employee consultOneEmployee(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    //modificação parcial
    @PutMapping("/employees/update/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, Long id){
        return repository.findById(id).map(employee -> {
            employee.setName(newEmployee.getName());
            employee.setAddress(newEmployee.getAddress());
            employee.setRole(newEmployee.getRole());
            return repository.save(newEmployee);
        }).orElseGet(() -> {
            newEmployee.setId(id);
            return repository.save(newEmployee);
        });
    }

    @DeleteMapping("/employees/delete/{id}")
    ResponseEntity<Object> deleteEmployee(@PathVariable Long id){
        Optional<Employee> employee = repository.findById(id);
        if (employee.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
