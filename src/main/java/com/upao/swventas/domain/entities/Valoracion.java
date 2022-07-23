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
@Table(name="valoracion")
@Getter
@Setter
@ToString
public class Valoracion {
	
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

    @Column(name="email")
    @JsonProperty("email")
    private String email;

    @Column(name="comentario")
    @JsonProperty("comentario")
    private String comentario;
    
    @Column(name="valor")
    @JsonProperty("valor")
    private Integer valor;

}
