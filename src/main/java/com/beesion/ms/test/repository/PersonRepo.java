package com.beesion.ms.test.repository;

import com.beesion.ms.model.Person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepo implements PanacheRepository<Person> {
    // Ya tienes persist(), findById(), listAll(), etc. listos para usar
}
