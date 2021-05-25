package com.example.cartax.repositories;

import com.example.cartax.models.Customer;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Api(tags = "Address Entity")
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
@CrossOrigin
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {



}
