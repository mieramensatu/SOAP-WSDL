package com.example.pemograman.endpoint;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.pemograman.model.Books;
import com.example.pemograman.repository.BooksRepository;
import com.example.demo.GetAllBooksRequest;
import com.example.demo.GetAllBooksResponse;
import com.example.demo.MyRequest;
import com.example.demo.MyResponse;


//digenerate jaxb

@Endpoint
public class MyEndpoint {
    
    @Autowired
    private BooksRepository booksRepository;

    @PayloadRoot(namespace = "http://example.com/demo", localPart = "MyRequest")
    @ResponsePayload
    public MyResponse myMethod(@RequestPayload MyRequest request) {
        MyResponse response = new MyResponse();
        response.setResponseMessage("This is a response to: " + request.getRequestMessage());
        return response;
    } 

    @PayloadRoot(namespace = "http://example.com/demo", localPart = "GetAllStudentRequest")
    @ResponsePayload
    public GetAllBooksResponse getAllBooksResponse(@RequestPayload GetAllBooksRequest request) {
        GetAllBooksResponse response = new GetAllBooksResponse();
        List<Books> books = booksRepository.findAll();
        List<com.example.pemograman.model.Books> responseBooks = new ArrayList<>();
        for (Books books2 : books) {
            com.example.pemograman.model.Books responseBooks2 = new com.example.pemograman.model.Books();
            responseBooks2.setId_books(books2.getId_books());
            responseBooks2.setName_books(books2.getName_books());
            responseBooks2.setKategori_books(books2.getKategori_books());
            responseBooks.add(responseBooks2);
           // System.out.println("Product: " + product.getName());
            
        }
        response.getBooks();
        





        return response;
    }
      
}

