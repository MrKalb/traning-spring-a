package br.com.compasso.treinamento.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compasso.treinamento.dto.Book;
import br.com.compasso.treinamento.entities.BookEntity;
import br.com.compasso.treinamento.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository; 
	
	@Autowired
	private ModelMapper mapper; 
	
	public void createBook(Book book) {
		BookEntity entity = mapper.map(book,BookEntity.class);
		entity.setId(null);
		repository.save(entity);
	}
	
	
}
