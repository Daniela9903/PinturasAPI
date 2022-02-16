package com.example.PintutasAPI.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.PintutasAPI.models.PinturaModel;
import com.example.PintutasAPI.repositories.PinturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PinturaService {
    @Autowired
    PinturaRepository pinturaRepository;
    public ArrayList<PinturaModel> obtenerPinturas(){
        return (ArrayList<PinturaModel>)pinturaRepository.findAll();
    }

    public PinturaModel guardaPintura(PinturaModel pintura){
        return pinturaRepository.save(pintura);
    }

    public Optional<PinturaModel>obtenerPorId(Long id_pintura){
        return pinturaRepository.findById(id_pintura);
    }
}
