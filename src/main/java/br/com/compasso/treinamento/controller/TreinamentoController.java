package br.com.compasso.treinamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.compasso.treinamento.dto.Book;
import br.com.compasso.treinamento.services.BookService;

@RestController
public class TreinamentoController {

	@Autowired
	private BookService service; 
	
	@GetMapping("/greating")
	public ResponseEntity<String> greatings() {
		return ResponseEntity.ok("Hello World!");
	}

	@PostMapping("/book")
	public ResponseEntity<Void> createBook(@RequestBody Book book) {
		service.createBook(book);
		return ResponseEntity.noContent().build(); 
	}
	
}
