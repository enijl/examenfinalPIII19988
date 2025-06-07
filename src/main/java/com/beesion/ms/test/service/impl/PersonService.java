package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IPersonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PersonService implements IPersonService {

    @Inject
    PersonRepo personRepo;  // Inyección correcta

    @Override
    @Transactional   // <--- Aquí
    public void save(Person per) {
        personRepo.persist(per);  // o save(per) según tu repo
    }
}
