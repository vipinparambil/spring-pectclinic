package com.projectx.petclinicstart.repositories;

import com.projectx.petclinicstart.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
