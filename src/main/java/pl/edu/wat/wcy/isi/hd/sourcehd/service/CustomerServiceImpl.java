package pl.edu.wat.wcy.isi.hd.sourcehd.service;

import org.jfairy.Fairy;
import org.jfairy.producer.company.Company;
import org.jfairy.producer.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wat.wcy.isi.hd.sourcehd.pojo.Customer;
import pl.edu.wat.wcy.isi.hd.sourcehd.repository.CustomerRepository;

import java.util.Random;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private Random random = new Random();
    private Fairy fairy = Fairy.create();

    @Override
    public void addRandomData(Integer count){
        for(int i = 0; i<count; i++){
            customerRepository.save(random.nextInt(3) != 0 ? getRandomIndividualCustomer() : getRandomBusinessCustomer());
        }

    }

    private Customer getRandomBusinessCustomer(){
        Person person = fairy.person();

        return new Customer("P",
                person.email(),
                person.firstName(),
                person.lastName(),
                null,
                person.telephoneNumber(),
                getRandomNumberString(11),
                null,
                getRandomStatus(),
                person.getAddress().getPostalCode(),
                person.getAddress().getCity(),
                "",
                "");
    }

    private Customer getRandomIndividualCustomer(){
        Company company = fairy.company();

        return new Customer("B",
                company.email(),
                null,
                null,
                company.name(),
                null,
                null,
                getRandomNumberString(9),
                getRandomStatus(),
                null,
                null,
                null,
                null);
    }

    private String getRandomNumberString(Integer count){
        String numberString = "";

        for(int i = 0; i<count; i++){
            numberString += Integer.toString(random.nextInt(10));
        }

        return numberString;
    }

    private String getRandomStatus(){
        return random.nextInt(2) == 0 ? "A" : "N";
    }
}
