package br.com.compasso.treinamento.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

	private String title; 
	
	private String description; 
	
	@JsonProperty("publish_year")
	private LocalDateTime publishYear; 
	
}
