package com.jhonsc.springbootapp.product.models.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Clase entitidad para la persistencia en la tabla proeucto en base de datos.
 * 
 * @author jhoncalderon
 *
 */
@Data
@Entity
@Table(name = "producto")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String productName;
	@Column(name = "precio")
	private BigDecimal price;
	@Column(name = "fecha_creacion")
	private LocalDate createAt;

}
