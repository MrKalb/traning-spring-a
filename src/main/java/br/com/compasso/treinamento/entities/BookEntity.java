package br.com.compasso.treinamento.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name = "BOOK")
@DynamicUpdate
@DynamicInsert
public class BookEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "BOOK_ID_SEQ", sequenceName = "BOOK_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_ID_SEQ")
	@Column(name = "id", columnDefinition = "serial")
	private Long id; 

	@Column(name = "TITLE")
	private String title; 
	
	@Column(name = "DESCRIPTION")
	private String description; 
	
	@Column(name="PUBLISH_YEAR")
	private LocalDateTime publishYear; 
	
}
