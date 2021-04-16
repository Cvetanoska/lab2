package emt2021.lab2.model;


import emt2021.lab2.model.enumarations.Category;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "bookk")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Author author;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    private Integer availableCopies;

    public Book() {
    }

    public Book(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public Book(Long id, String name, Category category, Author author, Integer availablecopies) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availablecopies;
    }
}
