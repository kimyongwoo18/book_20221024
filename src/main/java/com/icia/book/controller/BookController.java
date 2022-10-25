package com.icia.book.controller;

import com.icia.book.dto.BookDTO;
import com.icia.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("/save")
    public String saveForm() {

        return "bookSave";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute BookDTO bookDTO, Model model){


        String result = bookService.save(bookDTO);
        model.addAttribute("result", result);

        return "index";
    }
    @GetMapping("/findBook")
    public String findBook(Model model) {
        BookDTO findResult = bookService.findBook();
        //특정 id책의 전체정보이기 때문에 DTO로 받는다.
        model.addAttribute("book", findResult);
        return "findBook";
    }
    @GetMapping("/books")
    public String findAll(Model model) {
        List<BookDTO> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "bookList";
    }
}
