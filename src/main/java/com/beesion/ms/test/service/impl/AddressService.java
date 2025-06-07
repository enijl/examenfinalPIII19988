package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.mapper.AddressMapper;
import com.beesion.ms.test.repository.AddressRepo;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IAddressService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AddressService implements IAddressService {

    @Inject
    AddressRepo addressRepo;

    @Inject
    PersonRepo personRepo;

    @Override
    public void save(AddressDto dto) {
        Person person = personRepo.findById(dto.getPersonId());
        if (person != null) {
            Address address = AddressMapper.toEntity(dto, person);
            addressRepo.persist(address);
        }
        // Si no existe, en un sistema real deberías lanzar una excepción
    }

    @Override
    public List<AddressDto> findByPersonId(Long personId) {
        return addressRepo
                .find("person.id", personId)
                .stream()
                .map(a -> AddressMapper.toDto((Address) a))
                .collect(Collectors.toList());
    }
}
