package com.upao.swventas.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="formulario")
@Getter
@Setter
@ToString
public class Formulario {
	
	@Id
    @Column(name="id")
	@JsonProperty("id")
    private Integer id;

    @Column(name="nombre")
    @JsonProperty("nombre")
    private String nombre;

    @Column(name="apellido")
    @JsonProperty("apellido")
    private String apellido;

    @Column(name="telefono")
    @JsonProperty("telefono")
    private String telefono;

    @Column(name="departamento")
    @JsonProperty("departamento")
    private String departamento;

    @Column(name="ciudad")
    @JsonProperty("ciudad")
    private String ciudad;

    @Column(name="distrito")
    @JsonProperty("distrito")
    private String distrito;

    @Column(name="direccion")
    @JsonProperty("direccion")
    private String direccion;

    @Column(name="referencia")
    @JsonProperty("referencia")
    private String referencia;
    
    @Column(name="tipomadera")
    @JsonProperty("tipomadera")
    private String tipoMadera;

    @Column(name="cantidad")
    @JsonProperty("cantidad")
    private String cantidad;

    @Column(name="descripcion")
    @JsonProperty("descripcion")
    private String descripcion;

    @Column(name="estado")
    @JsonProperty("estado")
    private Boolean estado;
    

}
