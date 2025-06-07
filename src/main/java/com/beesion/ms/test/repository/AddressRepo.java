package com.beesion.ms.test.repository;

import com.beesion.ms.model.Address;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AddressRepo implements PanacheRepository<Address> {
    //  Panache para simplificar la interacción con la base de datos
}
