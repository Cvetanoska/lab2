package emt2021.lab2.repository;


import emt2021.lab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    void deleteByName(String name);
}
