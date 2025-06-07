package com.beesion.ms.test.resource;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.service.IAddressService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/addresses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressResource {

    @Inject
    IAddressService addressService;

    // Crear una dirección
    @POST
    public Response create(AddressDto addressDto) {
        addressService.save(addressDto);
        return Response.status(Response.Status.CREATED).build();
    }

    // Listar direcciones por id de persona
    @GET
    @Path("/person/{personId}")
    public List<AddressDto> getByPersonId(@PathParam("personId") Long personId) {
        return addressService.findByPersonId(personId);
    }
}
