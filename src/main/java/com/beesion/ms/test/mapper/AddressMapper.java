package com.beesion.ms.test.mapper;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;

public class AddressMapper {

    //  AddressDto a Address (necesita una persona como parámetro)
    public static Address toEntity(AddressDto dto, Person person) {
        Address address = new Address();
        address.setStreet(dto.getStreet());
        address.setCity(dto.getCity());
        address.setPerson(person);
        return address;
    }

    // Convierte Address a AddressDto (incluye el id de la persona)
    public static AddressDto toDto(Address address) {
        AddressDto dto = new AddressDto();
        dto.setStreet(address.getStreet());
        dto.setCity(address.getCity());
        dto.setPersonId(address.getPerson().getId());
        return dto;
    }
}
