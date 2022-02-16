package com.example.PintutasAPI.repositories;

import com.example.PintutasAPI.models.PinturaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinturaRepository extends CrudRepository<PinturaModel , Long> {
   
}