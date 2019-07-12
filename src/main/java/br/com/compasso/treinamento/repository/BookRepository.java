package br.com.compasso.treinamento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.treinamento.entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

	//@Query("SELECT O FROM BOOK O WHERE O.TITLE = ?")
	Optional<BookEntity> findByTitle(String title);
	
}
