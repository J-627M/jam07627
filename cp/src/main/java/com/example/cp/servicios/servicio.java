package com.example.cp.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cp.modelos.Asentamientos;
import com.example.cp.repositorios.AsentamientoRepo;
import java.util.List;

@Service
public class servicio {

    @Autowired
    private AsentamientoRepo asentamientosRepo;

    public List<Asentamientos> buscarPorCodigoPostal(String codigoPostal) {
        return asentamientosRepo.findByCodigoPostal(codigoPostal);
    }

}