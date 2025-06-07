package com.beesion.ms.test.mapper;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

public class PersonMapper {

   
    public static Person toEntity(PersonDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        return p;
    }

   
    public static PersonDto toDto(Person entity) {
        PersonDto dto = new PersonDto();
        dto.setName(entity.getName());
        return dto;
    }
}
