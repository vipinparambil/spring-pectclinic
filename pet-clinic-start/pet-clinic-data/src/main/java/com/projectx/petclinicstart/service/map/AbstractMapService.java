package com.projectx.petclinicstart.service.map;

import com.projectx.petclinicstart.model.BaseEntity;

import java.util.*;
import java.util.stream.BaseStream;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long>{

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }
    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId() {
        Long nextId = 1L;
        if (!map.isEmpty()){
            nextId = Collections.max(map.keySet()) + 1;
        }
        return nextId;
    }

}
