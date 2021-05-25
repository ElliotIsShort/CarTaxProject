package com.example.cartax.DTO;

import com.example.cartax.DTO.CustomerDTO;
import com.example.cartax.models.Car;
import com.example.cartax.models.Customer;
import com.example.cartax.repositories.CarRepository;
import com.example.cartax.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerDTOService
{
    @Autowired
    private CarRepository carRepository;

    private CustomerDTO covertToCustomerDTO(Car car)
    {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerid(car.getCustomerid().getCustomerid());
        customerDTO.setFname(car.getCustomerid().getFname());
        customerDTO.setSname(car.getCustomerid().getSname());
        customerDTO.setAddress(car.getCustomerid().getAddress());
        customerDTO.setPostcode(car.getCustomerid().getPostcode());
        customerDTO.setRegplate(car.getRegplate());
        customerDTO.setMake(car.getMake());
        customerDTO.setModel(car.getModel());

        return customerDTO;
    }

    public List<CustomerDTO> getAllCustomerDTO()
    {
        return ((List<Car>)carRepository.findAll()).stream().map(this::covertToCustomerDTO).collect(Collectors.toList());
    }

    public CustomerDTO getCustomerDTOById(int id)
    {
        List<CustomerDTO> customerDTOList = getAllCustomerDTO();

        for(CustomerDTO customerDTO : customerDTOList)
        {
            System.out.println(customerDTO.getCustomerid());
            if(customerDTO.getCustomerid() == id)
            {
                return customerDTO;
            }
        }
        return null;
    }
}
