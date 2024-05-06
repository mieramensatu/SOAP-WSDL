package com.example.pemograman.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pemograman.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>{
    List<Books> findAll();
}
