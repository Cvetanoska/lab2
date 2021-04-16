package emt2021.lab2.model.dto;

import emt2021.lab2.model.enumarations.Category;
import lombok.Data;

@Data
public class BookDTO {

    private String name;
    private Long author;
    private Category category;
    private Integer availableCopies;

    public BookDTO() {
    }


    public BookDTO(String name, Category category, Long author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
