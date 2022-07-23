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
@Table(name="usuario")
@Getter
@Setter
@ToString
public class Usuario {
	
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

    @Column(name="celular")
    @JsonProperty("celular")
    private String celular;

    @Column(name="dni")
    @JsonProperty("dni")
    private String dni;

    @Column(name="correo")
    @JsonProperty("correo")
    private String correo;

    @Column(name="contrasena")
    @JsonProperty("contrasena")
    private String contrasena;

    

}
