package com.projectx.petclinicstart.repositories;

import com.projectx.petclinicstart.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Visit, Long> {
}
