package com.example.pemograman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_books;
    private String name_books;
    private String kategori_books;

    public int getId_books(){
        return id_books;
    }
    public void setId_books(int id_books){
        this.id_books = id_books;
    }
    public String getName_books(){
        return name_books;
    }
    public void setName_books(String name_books){
        this.name_books = name_books;
    }
    public String getKategori_books(){
        return kategori_books;
    }
    public void setKategori_books(String kategori_books){
        this.kategori_books = kategori_books;
    }


}