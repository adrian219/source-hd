package pl.edu.wat.wcy.isi.hd.sourcehd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wat.wcy.isi.hd.sourcehd.pojo.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
