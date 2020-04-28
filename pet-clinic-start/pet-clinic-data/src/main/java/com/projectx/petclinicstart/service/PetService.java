package com.projectx.petclinicstart.service;

import java.util.Set;

import com.projectx.petclinicstart.model.Pet;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet p);

    Set<Pet> findAll();

}
