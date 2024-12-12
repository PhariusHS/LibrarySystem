package com.luca.projects.library_management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luca.projects.library_management.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
