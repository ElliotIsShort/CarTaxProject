package com.example.cartax.DTO;

import com.example.cartax.models.Registration;
import com.example.cartax.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistrationDTOService
{
    @Autowired
    private RegistrationRepository registrationRepository;

    private RegistrationDTO convertToRegistrationDTO(Registration registration)
    {
        RegistrationDTO registrationDTO = new RegistrationDTO();
        registrationDTO.setRegistrationid(registration.getRegistrationid());
        registrationDTO.setType(registration.getTaxid().getType());
        registrationDTO.setPrice(registration.getTaxid().getPrice());
        registrationDTO.setExpiry(registration.getExpiry());
        registrationDTO.setRegplate(registration.getCarid().getRegplate());

        return registrationDTO;
    }

    public List<RegistrationDTO> getAllRegistrationDTO()
    {
        return ((List<Registration>)registrationRepository.findAll()).stream().map(this::convertToRegistrationDTO).collect(Collectors.toList());
    }

    public RegistrationDTO getRegistrationDTOById(int id)
    {
        List<RegistrationDTO> registrationDTOList = getAllRegistrationDTO();

        for(RegistrationDTO registrationDTO : registrationDTOList)
        {
            if(registrationDTO.getRegistrationid() == id)
            {
                return registrationDTO;
            }
        }
        return null;
    }
}
