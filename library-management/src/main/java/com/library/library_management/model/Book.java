package com.library.library_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //Defines a Database Table
@Table(name = "books") //Names the Table "books"
@Getter //Generate all Getters
@Setter //Generate all Setters
@NoArgsConstructor //Generate empty constructor
@AllArgsConstructor //generate full constructor

public class Book {
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) //Book title is required*
    private String title;

    @Column(nullable = false) //Book author is required*
    private String author;

    private String isbn;

    private boolean available; // True or false only
}
