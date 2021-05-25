package com.example.cartax.repositories;

import com.example.cartax.DTO.CustomerDTO;
import com.example.cartax.DTO.CustomerDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CustomerDetailsRepository
{
    @Autowired
    private CustomerDTOService customerDTOService;

    @GetMapping("/customerdetails")
    public List<CustomerDTO> getAllCustomerDetails() { return customerDTOService.getAllCustomerDTO(); }

    @GetMapping("/customerdetails/{id}")
    public CustomerDTO getCustomerById(@PathVariable("id") int customerId)
    {
        CustomerDTO customerDTO = customerDTOService.getCustomerDTOById(customerId);

        if(customerDTO != null)
        {
            return customerDTO;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer ID not found");
    }
}
