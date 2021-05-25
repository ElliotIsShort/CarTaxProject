package com.example.cartax.repositories;

import com.example.cartax.models.Car;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Api(tags = "Address Entity")
@RepositoryRestResource(collectionResourceRel = "car", path = "car")
@CrossOrigin
public interface CarRepository extends PagingAndSortingRepository<Car, Integer> {



}
