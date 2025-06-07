package com.beesion.ms.test.service;

import com.beesion.ms.test.dto.AddressDto;
import java.util.List;

public interface IAddressService {
    void save(AddressDto addressDto);
    List<AddressDto> findByPersonId(Long personId);
}
