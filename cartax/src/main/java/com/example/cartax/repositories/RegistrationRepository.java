package com.example.cartax.repositories;

import com.example.cartax.models.Registration;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Api(tags = "Address Entity")
@RepositoryRestResource(collectionResourceRel = "registration", path = "registration")
@CrossOrigin
public interface RegistrationRepository extends PagingAndSortingRepository<Registration, Integer> {



}
