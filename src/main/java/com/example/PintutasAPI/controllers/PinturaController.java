package com.example.PintutasAPI.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.PintutasAPI.models.PinturaModel;
import com.example.PintutasAPI.services.PinturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pintura") 
public class PinturaController {
    @Autowired
    PinturaService pinturaService;
    
//GET
@GetMapping()
public ArrayList<PinturaModel> obtenerPinturas(){
    return pinturaService.obtenerPinturas();
}
//POST
@PostMapping()
public PinturaModel guardarPintura(@RequestBody PinturaModel pintura){
    return this.pinturaService.guardaPintura(pintura);
}
//BUSCAR POR ID
@GetMapping(path = "/{id_pintura}")
public Optional<PinturaModel> obtenerPorId(@PathVariable("id_pintura")Long id_pintura){
    return this.pinturaService.obtenerPorId(id_pintura);
}

}