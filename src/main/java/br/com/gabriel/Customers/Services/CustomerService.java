package br.com.gabriel.Customers.Services;

import Repositories.CustomerRepository;
import br.com.gabriel.Customers.Repositories.CustomerRepository;
import br.com.gabriel.Customers.entities.Customer;
import entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class CustomerService {

    @Autowired
    static
    CustomerService customerService;

    public static Customer create(Customer customer){
     customerService.save(customer);
     return customer;
    }

    private void save(Customer customer) {
    }

    public List<Customer> findall(){
    return CustomerRepository.findall();
    }

    public Customer findById(UUID idcustomer){
        return (Customer) CustomerRepository.findById(idcustomer).orElseThrow();
    }
}
