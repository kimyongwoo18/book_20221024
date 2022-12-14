package com.icia.book.service;

import com.icia.book.dto.BookDTO;
import com.icia.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    public String save(BookDTO bookDTO) {
        System.out.println("bookDTO = " + bookDTO);
        bookRepository.save(bookDTO);
        String result = null;
        if(bookDTO != null){
            result ="등록되었습니다.";
        }else{
            result ="등록되지않았습니다.";
        }
        return result;
    }

    public BookDTO findBook() {
        BookDTO findResult = bookRepository.findBook();
        return findResult;

    }

    public List<BookDTO> findAll() {
        return bookRepository.findAll();
    }

    public BookDTO findBookId(Long bookid) {

        return bookRepository.findBookId(bookid);
    }
}
