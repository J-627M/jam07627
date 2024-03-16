package com.example.cp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cp.modelos.Municipios;

@Repository
public interface MunicipioRepo extends JpaRepository<Municipios, Long> {
    
}