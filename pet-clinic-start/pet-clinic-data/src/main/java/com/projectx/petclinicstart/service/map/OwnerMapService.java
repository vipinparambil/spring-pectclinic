package com.projectx.petclinicstart.service.map;

import com.projectx.petclinicstart.model.Owner;
import com.projectx.petclinicstart.service.CrudeService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudeService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
