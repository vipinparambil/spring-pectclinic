package com.projectx.petclinicstart.service;

import java.util.Set;

import com.projectx.petclinicstart.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save(Owner o);

    Set<Owner> findAll();
}
