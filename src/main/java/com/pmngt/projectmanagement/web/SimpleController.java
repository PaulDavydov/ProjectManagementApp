package com.pmngt.projectmanagement.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

//    @Autowired
//    private BookRepository bookRepository;
//
//    @GetMapping("/")
//    public String homePage(Model model) {
//        model.addAttribute("appName", appName);
//        return "home";
//    }
//
//    @GetMapping("/create")
//    public String bookForm(Model model) {
//        model.addAttribute("book", new Book());
//        return "create";
//    }
//
//    @PostMapping("/create")
//    public String createBook(@RequestParam String title, String author, Model model) {
//        Book book1 = bookRepository.save(new Book(title,author));
//        model.addAttribute("book", book1);
//        return "result";
//    }
}
