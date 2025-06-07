package com.beesion.ms.test.resource;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.service.IPersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/Person")
public class PersonaResource {

    @Inject
    IPersonService personService;  // se inyeta la interfaz, no la implementación 

    @POST
    public Response save(PersonDto per) {
        // este PersonMapper se usa para convertir el DTO a entidad
        Person p = PersonMapper.toEntity(per);
        personService.save(p);
        
        return Response.ok("Elemento guardado").build();
    }
}
