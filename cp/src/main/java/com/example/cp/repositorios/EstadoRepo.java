package com.example.cp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cp.modelos.Estados;

@Repository
public interface EstadoRepo extends JpaRepository<Estados, Long> {
    
}