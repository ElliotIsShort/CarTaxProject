package com.example.cartax.repositories;

import com.example.cartax.DTO.RegistrationDTO;
import com.example.cartax.DTO.RegistrationDTOService;
import com.example.cartax.models.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class RegistrationDetailsRepository
{
    @Autowired
    private RegistrationDTOService registrationDTOService;

    @GetMapping("/registrationdetails")
    public List<RegistrationDTO> getAllRegistrationDetails() { return registrationDTOService.getAllRegistrationDTO(); }

    @GetMapping("/registrationdetails/{id}")
    public RegistrationDTO getRegistrationById(@PathVariable("id") int registrationId)
    {
        RegistrationDTO registrationDTO = registrationDTOService.getRegistrationDTOById(registrationId);

        if(registrationDTO != null)
        {
            return registrationDTO;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Registration ID not found");
    }
}
