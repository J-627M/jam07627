package com.example.cp.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cp.modelos.Asentamientos;

@Repository
public interface AsentamientoRepo extends JpaRepository<Asentamientos, Long> {

    List<Asentamientos> findByCodigoPostal(String codigoPostal);
}
