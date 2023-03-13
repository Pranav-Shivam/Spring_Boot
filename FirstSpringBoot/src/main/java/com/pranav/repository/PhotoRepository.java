package com.pranav.repository;

import com.pranav.model.Photo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface PhotoRepository extends CrudRepository<Photo,Integer> {
}
