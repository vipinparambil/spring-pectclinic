package com.projectx.petclinicstart.service;

import java.util.Set;

import com.projectx.petclinicstart.model.Owner;

public interface OwnerService extends CrudeService<Owner, Long>{

    Owner findByLastName(String lastName);

}
