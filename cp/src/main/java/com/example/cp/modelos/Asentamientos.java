package com.example.cp.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asentamientos")
public class Asentamientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idmnpio")
    private Long idmnpio;

    @Column(name = "codigopostal")
    private String codigopostal;

    @Column(name = "asentamientoColum")
    private String asentamientoColum;

    @ManyToOne
    @JoinColumn(name = "idmnpio", referencedColumnName = "id", insertable = false, updatable = false)
    private Municipios municipios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdmnpio() {
        return idmnpio;
    }

    public void setIdmnpio(Long idmnpio) {
        this.idmnpio = idmnpio;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getAsentamientoColum() {
        return asentamientoColum;
    }

    public void setAsentamientoColum(String asentamientoColum) {
        this.asentamientoColum = asentamientoColum;
    }

    public Municipios getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Municipios municipios) {
        this.municipios = municipios;
    }
}