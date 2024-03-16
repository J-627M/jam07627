package com.example.cp.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cp.modelos.Asentamientos;
import com.example.cp.servicios.servicio;

@RestController
public class contrl {

    @Autowired
    private servicio codigosPostalesServicio;

    @GetMapping("/codigos-postales/{codigoPostal}")
    public List<Asentamientos> buscarPorCodigoPostal(@PathVariable String codigoPostal) {
        return codigosPostalesServicio.buscarPorCodigoPostal(codigoPostal);
    }
}