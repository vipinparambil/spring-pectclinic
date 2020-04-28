package com.projectx.petclinicstart.service;

import java.util.Set;

import com.projectx.petclinicstart.model.Vet;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet v);

    Set<Vet> findAll();

}
