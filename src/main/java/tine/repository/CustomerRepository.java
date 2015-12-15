package tine.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tine.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
